package com.javaee.mybatis.relations.domain;

import lombok.Data;

import java.util.List;

@Data
public class Teacher {
    Long id;
    String name;
    String office;
    Integer age;
    String email;
    String cellphone;
    List<Course> courseList;
}
