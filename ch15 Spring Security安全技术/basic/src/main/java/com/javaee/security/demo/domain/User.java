package com.javaee.security.demo.domain;

import lombok.Data;

@Data
public class User {
    Long id;
    String username;
    String password;
    int valid;
}
