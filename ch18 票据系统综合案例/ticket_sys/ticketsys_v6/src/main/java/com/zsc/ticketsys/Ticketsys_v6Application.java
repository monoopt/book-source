package com.zsc.ticketsys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Ticketsys_v6Application {
    public static void main(String[] args) {
        SpringApplication.run(Ticketsys_v6Application.class, args);
    }

}
