package com.javaee.mybatis.model;

import lombok.Data;

@Data
public class Student {
    Long id;
    String username;
    String password;
    Integer age;
    String grade;
}
