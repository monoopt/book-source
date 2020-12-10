package com.javaee.mybatis.relations.domain;

import lombok.Data;

@Data
public class User {
    Long id;
    String username;
    String password;
    String email;
}

