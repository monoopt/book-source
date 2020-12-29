package com.javaee.mybatis.dynamicsql.mapper;

import com.javaee.mybatis.dynamicsql.domain.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    //根据学号,姓名以及性别查询学生信息
    public List<Student> findStudentSelective(Student queryBean);

    //批量插入学生信息
    public int batchInsert(List<Student> studentList);

}
