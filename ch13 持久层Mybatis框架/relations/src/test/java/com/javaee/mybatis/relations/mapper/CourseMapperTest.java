package com.javaee.mybatis.relations.mapper;

import com.javaee.mybatis.relations.domain.Course;
import com.javaee.mybatis.relations.domain.vo.CourseVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseMapperTest {

    @Autowired
    CourseMapper courseMapper;
    @Test
    void getDetailsById() {
        Course course = courseMapper.getDetailsById(1L);
        System.out.println("课程名称:"+ course.getCourseName());
        System.out.println("教师信息:"+ course.getTeacher());
    }

    @Test
    void getCourseVoById(){
        CourseVo coursVo = courseMapper.getCourseVoById(1L);
        System.out.println(coursVo);
        System.out.println("课程名字:"+coursVo.getCourseName()+";教师姓名:"+coursVo.getTeacherName());
    }

    @Test
    void getCourseWithTeacherById(){
        System.out.println(courseMapper.getCourseWithTeacherById(1L));
    }
}