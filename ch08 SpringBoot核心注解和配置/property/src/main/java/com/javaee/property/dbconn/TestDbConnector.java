package com.javaee.property.dbconn;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test1")
public class TestDbConnector implements DbConnector {
    @Override
    public void config() {
        System.out.println("test环境下的数据库配置");
    }
}
