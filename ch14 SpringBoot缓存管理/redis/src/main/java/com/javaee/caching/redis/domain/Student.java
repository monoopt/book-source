package com.javaee.caching.redis.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Student implements Serializable {
    Long id;
    String studentNo;
    String name;
    Date enrollTime;
    String homeAddress;
    String classNo;
    int sex;
    Date birthday;
}
