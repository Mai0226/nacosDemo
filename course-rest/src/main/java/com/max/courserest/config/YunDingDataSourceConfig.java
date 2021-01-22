package com.max.courserest.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
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
    @Bean
    public DataSource getDataSource(@Value("${spring.datasource.type:}") String type,
                                    @Value("${spring.datasource.driver-class-name:}") String driverClassName,
                                    @Value("${spring.datasource.url:}") String url,
                                    @Value("${spring.datasource.username:}") String username,
                                    @Value("${spring.datasource.password:}") String password,
                                    @Value("${spring.datasource.initialSize:}") Integer initialSize,
                                    @Value("${spring.datasource.minIdle:}") Integer minIdle,
                                    @Value("${spring.datasource.maxActive:}") Integer maxActive,
                                    @Value("${spring.datasource.maxWait:}") Integer maxWait,
                                    @Value("${spring.datasource.timeBetweenEvictionRunsMillis:}") Integer timeBetweenEvictionRunsMillis,
                                    @Value("${spring.datasource.minEvictableIdleTimeMillis:}") Integer minEvictableIdleTimeMillis,
                                    @Value("${spring.datasource.validationQuery:}") String validationQuery,
                                    @Value("${spring.datasource.connectionProperties:}") String connectionProperties) {

        DruidDataSource def = new DruidDataSource();
        def.setDriverClassName(driverClassName);
        def.setUrl(url);
        def.setUsername(username);
        def.setPassword(password);
        def.setInitialSize(initialSize);
        def.setMinIdle(minIdle);
        def.setMaxActive(maxActive);
        def.setMaxWait(maxWait);
        def.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        def.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        def.setValidationQuery(validationQuery);
        def.setTestWhileIdle(true);
        def.setTestOnBorrow(false);
        def.setTestOnReturn(false);
        def.setPoolPreparedStatements(true);
        def.setConnectionProperties(connectionProperties);
        return def;
    }
}

