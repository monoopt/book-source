package com.javaee.mybatis.dynamicsql.mapper;

import com.javaee.mybatis.dynamicsql.domain.Teacher;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeacherMapper {

    //根据id查询
    public Teacher getById(Long id);

    //查询教师个人信息以及所上的课程信息
    public Teacher getTeacherDetailsById(Long id);

}
