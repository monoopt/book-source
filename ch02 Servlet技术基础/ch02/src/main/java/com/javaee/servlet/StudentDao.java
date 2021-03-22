package com.javaee.servlet;

//封装数据的存储
public class StudentDao {
    public   Student getById(long id ){
        Student student =
                new Student("9000","LiQiang", 50,"计算机软件");
        student.setId(id);
        return  student;
    }
}
