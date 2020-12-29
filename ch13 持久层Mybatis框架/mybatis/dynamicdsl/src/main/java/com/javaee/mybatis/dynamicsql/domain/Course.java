package com.javaee.mybatis.dynamicsql.domain;


import lombok.Data;

@Data
public class Course {
    Long id;
    String courseName;
    int credit;
    String semester;
    Teacher teacher;
}
