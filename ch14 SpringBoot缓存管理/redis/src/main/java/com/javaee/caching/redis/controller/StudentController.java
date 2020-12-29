package com.javaee.caching.redis.controller;

import com.javaee.caching.redis.domain.Student;
import com.javaee.caching.redis.service.ApiStudentService;
import com.javaee.caching.redis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    ApiStudentService studentService;

    @GetMapping("/{id}")
    public Student get(@PathVariable Long id){
        return studentService.getById(id);
    }

}
