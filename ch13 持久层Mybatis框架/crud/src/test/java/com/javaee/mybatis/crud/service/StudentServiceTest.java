package com.javaee.mybatis.crud.service;

import com.github.pagehelper.PageInfo;
import com.javaee.mybatis.crud.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentServiceTest {
    @Autowired
    StudentService studentService;
    @Test
    public void list(){
        PageInfo<Student> pageInfo = studentService.list(2,4);
        System.out.println(pageInfo.getList());
    }
}