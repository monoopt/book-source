package com.javaee.mybatis.crud.dao;

import com.javaee.mybatis.crud.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@SpringBootTest
class StudentMapperTest {
    @Autowired
    StudentMapper studentMapper;

    @Test
    void listAll() {
        studentMapper.listAll().stream().forEach(System.out::println);
    }

    @Test
    void getById() {
        System.out.println(studentMapper.getById(1L));
    }


    @Test
    void add() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Student student = Student.builder().studentNo("202011005")
                .name("李冬鹏").classNo("软件工程20级")
                .birthday(sdf.parse("1990-04-28"))
                .enrollTime(sdf.parse("2019-09-01"))
                .homeAddress("广东省广州市越秀区新月路35号")
                .sex(1)
                .build();
        studentMapper.add(student);
        System.out.println("新插入记录的主键id=" + student.getId());
    }

    @Test
    void delete() {
        System.out.println(studentMapper.delete(2L));
    }

    @Test
    void update() {
        Student student = studentMapper.getById(1L);
        System.out.println(student);

        student.setClassNo("计算机科学20级");
        studentMapper.update(student);
        System.out.println(studentMapper.getById(1L));

    }

    @Test
    void listByName() {
        studentMapper.listByName("李冬鹏").stream().forEach(System.out::println);
    }

    @Test
    void listLikeAddress() {
        studentMapper.listLikeAddress("广州").forEach(System.out::println);
    }
}