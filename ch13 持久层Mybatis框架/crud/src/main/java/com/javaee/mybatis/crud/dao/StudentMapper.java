package com.javaee.mybatis.dao;

import com.javaee.mybatis.model.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper {
    @Select("select * from student")
    public List<Student> listAll();

    @Select("select * from student where id=#{id}")
    public Student getById(long id);

    @Insert("insert into student(username, password, age, grade) " +
            "values(#{username}, #{password},#{age},#{grade})")
    public int add(Student student);
}
