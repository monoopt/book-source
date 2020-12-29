package com.javaee.mybatis.relations.mapper;

import com.javaee.mybatis.relations.domain.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherMapperTest {

    @Autowired
    TeacherMapper teacherMapper;
    @Test
    void getById() {
        System.out.println(teacherMapper.getById(2L));
    }

    @Test
    void getTeacherDetailsById() {
        Teacher teacher = teacherMapper.getTeacherDetailsById(2L);
        System.out.println("教师个人信息:"+ teacher);
        System.out.println("教师课程信息:");
        teacher.getCourseList().forEach(System.out::println);
    }
}