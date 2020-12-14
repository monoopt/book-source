package com.javaee.mybatis.relations.domain;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Student {
    Long id;
    String studentNo;
    String name;
    Date enrollTime;
    String homeAddress;
    String classNo;
    int sex;
    Date birthday;

    List<Score> scoreList;
}
