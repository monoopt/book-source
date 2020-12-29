package com.javaee.mybatis.dynamicsql.mapper;

import com.javaee.mybatis.dynamicsql.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class StudentMapperTest {

    @Autowired
    StudentMapper studentMapper;
    @Test
    void findStudentSelective() {
        Student queryBean = new Student();
        queryBean.setName("李");
        queryBean.setStudentNo("20");
       // int sex = 1;
        System.out.println(studentMapper.findStudentSelective(queryBean));
    }

    //批量插入测试,插入1000条记录
    @Test
    void batchInsert() {
        for (int i=0; i<1000; i++){
            Student student = Student.builder().studentNo();

            Student;
        }
    }
}