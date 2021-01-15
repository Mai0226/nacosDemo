package com.max.userrest.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.max.userrest.domain.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@RestController
@RefreshScope
@RequestMapping(value = "/api/rest/user")
public class UserController {

    @Value("${student.name:max111}")
    private String name;
    @Value("${student.age:22}")
    private Integer age;

    @RequestMapping(value = "/userTest", method = RequestMethod.GET)
    public Map<String,Object> userTest(){
        Map<String,Object> result = new HashMap<>();
        result.put("code",200);
        result.put("status","Success");
        Student student = new Student();
        student.setAge(age);
        student.setName(name);
        result.put("user", student);
        return result;
    }

    @RequestMapping(value = "/simba/account/query", method = RequestMethod.POST)
    public Map<String, Object> queryAccountReport(@RequestBody String body){
        String sellerNick = "";
        String session = "";
        String dateTimeStr = "";
        Map<String, Object> res = new HashMap<>();
        try {

            Map<String, Object> params = JSONObject.parseObject(body);
            sellerNick = params.get("sellerNick").toString();
            session = params.get("session").toString();
            dateTimeStr = null == params.get("dateTimeStr")? "": params.get("dateTimeStr").toString();
            sellerNick = URLDecoder.decode(sellerNick, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            String errMsg = "sellerNick解码异常:" + e.getMessage();
        }
        String result = getAccountReport(session,sellerNick,dateTimeStr);
        res.put("result",result);
        return res;
    }

    public static String getAccountReport(String session, String sellerNick, String dateTimeStr){
        Map<String, Object> methodParams = new HashMap<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatterHour = DateTimeFormatter.ofPattern("HH");
        LocalDateTime dateTime = StringUtils.isEmpty(dateTimeStr)? LocalDateTime.now() : LocalDateTime.parse(dateTimeStr,formatter);
        methodParams.put("the_date", dateTime.format(formatterDate));
        methodParams.put("hour",dateTime.format(formatterHour));
        methodParams.put("nick",sellerNick);
        return JSON.toJSONString(methodParams);
    }
}
