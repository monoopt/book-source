package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
        System.out.println("Hello, world，第一个springboot项目.");
        SpringApplication.run(SpringbootApplication.class, args);
    }

}