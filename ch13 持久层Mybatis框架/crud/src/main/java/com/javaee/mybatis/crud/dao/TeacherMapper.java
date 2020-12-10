package com.javaee.mybatis.crud.dao;

import com.javaee.mybatis.crud.domain.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper {
    //查询所有学生
    @Select("select * from student")
    public List<Student> listAll();

    //根据id查询学生
    @Select("select * from student where id=#{id}")
    public Student getById(Long id);

    //新增记录
    @Insert("insert into student(student_no, name, enroll_time, home_address, class_no, sex, birthday) " +
            "values(#{studentNo}, #{name},#{enrollTime},#{homeAddress},#{classNo},#{sex},#{birthday})")
    @Options(useGeneratedKeys = true, keyProperty = "id") //返回自增主键,并保存在id属性中
    public int add(Student student);

    //删除记录
    @Delete("delete from student where id=#{id}")
    public int delete(Long id);

    //更新学生信息
    @Update("update student set home_address=#{homeAddress}, class_no=#{classNo} where id=#{id}")
    public int update(Student student);

    //根据姓名查询
    @Select("select * from student where name=#{name}")
    public List<Student> listByName(String name);

    //根据地址模糊查询
    @Select("select * from student where home_address like Concat('%', #{homeAddress}, '%')")
    public List<Student> listLikeAddress(String homeAddress);
}
