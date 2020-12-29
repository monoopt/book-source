package com.javaee.mybatis.dynamicsql.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
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

}
