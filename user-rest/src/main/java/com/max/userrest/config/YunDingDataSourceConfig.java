package com.max.userrest.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * 第三方平台的数据库配置
 *
 * @author Jerry
 * @date 2019-11-28
 */
@Configuration
@ConditionalOnProperty(name="ejlerp.dts.useDb", havingValue="true")
public class YunDingDataSourceConfig {
    @Bean(name = "masterDataSource")
    @Qualifier("masterDataSource")
    @ConfigurationProperties(prefix="spring.datasource.master")
    public DataSource jiaoguanjuDataSource() {
        return DataSourceBuilder.create().build();
    }

    /**
     *  广州数据源
     */
    @Bean(name = "slaveDataSource")
    @Qualifier("slaveDataSource")
    @ConfigurationProperties(prefix="spring.datasource.slave")
    public DataSource guangzhouDataSource() {
        return DataSourceBuilder.create().build();
    }
}

