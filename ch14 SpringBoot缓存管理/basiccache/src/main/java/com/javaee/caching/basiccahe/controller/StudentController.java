package com.javaee.caching.basiccahe.controller;

import com.javaee.caching.basiccahe.domain.Student;
import com.javaee.caching.basiccahe.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/{id}")
    public Student get(@PathVariable Long id){
        return studentService.getById(id);
    }

}
