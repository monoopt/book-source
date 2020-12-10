package com.javaee.mybatis.crud.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Teacher {
    Long id;
    String name;
    String office;
    Short age;
    String email;
    String cellphone;
}
