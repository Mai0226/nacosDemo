package com.max.courserest.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "api.rest")
public class AppConfig {

    private String dtsOrderServer;
    private String dtsItemServer;

    public String getDtsOrderServer() {
        return dtsOrderServer;
    }

    public void setDtsOrderServer(String dtsOrderServer) {
        this.dtsOrderServer = dtsOrderServer;
    }

    public String getDtsItemServer() {
        return dtsItemServer;
    }

    public void setDtsItemServer(String dtsItemServer) {
        this.dtsItemServer = dtsItemServer;
    }
}
