package com.javaee.mybatis.dao;

import com.javaee.mybatis.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentMapperTest {

    @Autowired
    StudentMapper studentMapper;

    @Test
    void listAll() {
        System.out.println(studentMapper.listAll());
    }

    @Test
    void getById(){
        Student s1 = studentMapper.getById(1);
        System.out.println(s1);
    }

    @Test
    void add(){
        Student student = new Student();
        student.setUsername("test");
        student.setPassword("123456");
        student.setAge(30);
        student.setGrade("大二");

        studentMapper.add(student);
    }

}