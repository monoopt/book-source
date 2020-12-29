package com.javaee.mybatis.relations.domain;


import lombok.Data;

@Data
public class Course {
    Long id;
    String courseName;
    int credit;
    String semester;
    Teacher teacher;
}
