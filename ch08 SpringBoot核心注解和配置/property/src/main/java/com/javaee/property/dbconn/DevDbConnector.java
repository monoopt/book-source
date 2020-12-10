package com.javaee.property.dbconn;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
@Profile("dev1")
public class DevDbConnector implements DbConnector {
    @Override
    public void config() {
        System.out.println("dev环境下的数据库配置");
    }
}
