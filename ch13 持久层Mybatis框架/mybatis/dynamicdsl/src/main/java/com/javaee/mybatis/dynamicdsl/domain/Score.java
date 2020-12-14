package com.javaee.mybatis.relations.domain;


import lombok.Data;

@Data
public class Score {
    Long id;
    Course course;
    Student student;
    double score;
    int status;
}
