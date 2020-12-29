package com.javaee.mybatis.crud.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javaee.mybatis.crud.domain.Student;
import com.javaee.mybatis.crud.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentMapper studentMapper;

    public PageInfo<Student> list(int pageNum, int pageSize){
        String order="student_no desc";
        PageHelper.startPage(pageNum, pageSize, order);
        List<Student> list = studentMapper.listAll();
        PageInfo<Student> pager = new PageInfo<>(list);
        return  pager;
    }
}
