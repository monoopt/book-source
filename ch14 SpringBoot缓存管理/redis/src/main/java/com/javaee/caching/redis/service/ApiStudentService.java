package com.javaee.caching.redis.service;

import com.javaee.caching.redis.domain.Student;
import com.javaee.caching.redis.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class ApiStudentService {
    @Autowired
    StudentMapper studentMapper;
    @Autowired
    RedisTemplate redisTemplate;

    public Student getById(Long id){
        //
        Object obj = redisTemplate.opsForValue().get("student_"+id);
        //缓存存在查找对象
        if(obj !=null){
            return  (Student)obj;
        }else {
            Student student = studentMapper.getById(id);
            redisTemplate.opsForValue().set("student_"+id,
                    student, 1, TimeUnit.HOURS);
            return student;
        }
    }
}
