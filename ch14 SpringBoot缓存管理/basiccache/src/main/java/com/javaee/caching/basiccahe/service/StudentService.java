package com.javaee.caching.basiccahe.service;

import com.javaee.caching.basiccahe.domain.Student;
import com.javaee.caching.basiccahe.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Cacheable(cacheNames = "student")
    public Student getById(Long id){
        return studentMapper.getById(id);
    }

    public List<Student> listAll(){
        return studentMapper.listAll();
    }
}
