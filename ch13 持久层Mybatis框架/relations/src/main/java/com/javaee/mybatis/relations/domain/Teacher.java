package com.javaee.mybatis.relations.onetoone.domain;

import lombok.Data;

@Data
public class Teacher {
    Long id;
    String name;
    String office;
    Integer age;
    String email;
    String cellphone;
}
