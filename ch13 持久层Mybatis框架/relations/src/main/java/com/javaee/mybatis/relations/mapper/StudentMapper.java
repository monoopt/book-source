package com.javaee.mybatis.relations.mapper;

import com.javaee.mybatis.relations.domain.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {
    public Student getStudentWithScoresById(Long id);
}
