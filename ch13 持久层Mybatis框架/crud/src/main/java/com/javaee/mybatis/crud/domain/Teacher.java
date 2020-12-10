package com.javaee.mybatis.crud.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Teacher {
    Long id;
    String name;
    String office;
    Short age;
    String email;
    String cellphone;
}
