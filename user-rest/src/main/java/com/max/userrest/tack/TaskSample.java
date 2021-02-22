package com.max.userrest.tack;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Component
public class TaskSample {
    /**
     * 简单任务（Bean模式）
     */
    /*@XxlJob(value = "TaskSample")
    public Map<String, Object> xxlTestSimpleJob(String param) {
        Map<String,Object> result = new HashMap<>();
        return result;
    }*/
}
