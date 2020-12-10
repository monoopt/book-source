package com.javaee.property.controller;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@ConfigurationProperties(prefix = "singer")
public class Singer {
    String name;
    int age;
    String[] city;

    @Value("${net.ip}")
    List<String> ip;
}

