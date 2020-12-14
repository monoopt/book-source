package com.javaee.mybatis.relations.mapper;

import com.javaee.mybatis.relations.domain.Course;
import com.javaee.mybatis.relations.domain.vo.CourseVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CourseMapper {
    //1.使用assosiation查询课程详情，包括任课老师信息
    public Course getDetailsById(@Param("id") Long id);

    //使用连表查询
    public  Course getCourseWithTeacherById(Long id);
    //使用VO封装查询结果
    @Select("select c.*, t.name teacher_name, t.office teacher_office, t.email teacher_email " +
            "from course c ,teacher t where c.teacher_id = t.id and c.id=#{id} ")
    public CourseVo getCourseVoById(Long id);



}
