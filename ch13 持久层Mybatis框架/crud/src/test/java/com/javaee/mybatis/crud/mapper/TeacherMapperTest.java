package com.javaee.mybatis.crud.mapper;

import com.javaee.mybatis.crud.domain.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherMapperTest {

    @Autowired
    TeacherMapper teacherMapper;
    @Test
    void listAll() {
        teacherMapper.listAll().forEach(System.out::println);
    }

    @Test
    void getById() {
        System.out.println(teacherMapper.getById(1L));
    }


    @Test
    void add() {
        Teacher teacher = new Teacher();
        teacher.setAge(40);
        teacher.setCellphone("13549998800");
        teacher.setEmail("yangming@gmail.com");
        teacher.setName("杨明");
        teacher.setOffice("厚德楼708");

        teacherMapper.add(teacher);
        System.out.println("新教师记录的id="+ teacher.getId());
        System.out.println(teacherMapper.getById(teacher.getId()));
    }

    @Test
    void delete() {
        System.out.println(teacherMapper.getById(11L));
        teacherMapper.delete(11L);
        System.out.println(teacherMapper.getById(11L));
    }

    @Test
    void listLikeName() {
        String keyword="杨";
        teacherMapper.listLikeName(keyword).stream().forEach(System.out::println);
    }

    @Test
    void update() {
        Teacher teacher = teacherMapper.getById(9L);
        System.out.println(teacher);
        teacher.setOffice("厚德楼809");
        teacherMapper.update(teacher);
        System.out.println("修改后的教师数据为:");
        System.out.println(teacherMapper.getById(9L));
    }


}