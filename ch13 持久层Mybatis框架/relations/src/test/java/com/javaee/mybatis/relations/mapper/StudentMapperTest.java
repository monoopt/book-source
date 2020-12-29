package com.javaee.mybatis.relations.mapper;

import com.javaee.mybatis.relations.domain.Score;
import com.javaee.mybatis.relations.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentMapperTest {
    @Autowired
    StudentMapper studentMapper;

    @Test
    void getStudentWithScoresById() {
        Student student = studentMapper.getStudentWithScoresById(1L);
        System.out.println(studentMapper.getStudentWithScoresById(1L));
        System.out.println("学生姓名:"+ student.getName()+
                ";学号:"+ student.getStudentNo());
        System.out.println("课程成绩:");
        for (Score score: student.getScoreList()
             ) {
            System.out.println("课程名称:"+ score.getCourse().getCourseName()
                    +";成绩:"+ score.getScore());
        }
    }

}