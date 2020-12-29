package com.javaee.caching.basiccahe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
//开启springboot缓存
@EnableCaching

public class BasiccaheApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasiccaheApplication.class, args);
    }

}
