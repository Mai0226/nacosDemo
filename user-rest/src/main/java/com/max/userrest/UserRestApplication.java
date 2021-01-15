package com.max.userrest;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@NacosPropertySource(dataId = "springboot2-nacos-config", autoRefreshed = true)
@EnableDiscoveryClient
public class UserRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserRestApplication.class, args);
    }

}
