package com.javaee.caching.redis.service;

import com.javaee.caching.redis.domain.Student;
import com.javaee.caching.redis.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Cacheable(cacheNames = "student", unless = "#result==null")
    public Student getById(Long id){
        return studentMapper.getById(id);
    }

    @CachePut(cacheNames = "student", key = "#result.id")
    public Student update(Student student){
        studentMapper.update(student);
        return student;
    }

    @CacheEvict(cacheNames = "student")
    public void delete(Long id){
        studentMapper.delete(id);
    }

    public List<Student> listAll(){
        return studentMapper.listAll();
    }
}
