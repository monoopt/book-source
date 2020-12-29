package com.javaee.mybatis.relations.domain.vo;

import com.javaee.mybatis.relations.domain.Course;
import lombok.Data;

/**
 * 定义要查询的和两个表都关联的字段值
 */
@Data
public class CourseVo extends Course {
    String teacherName;
    String teacherEmail;
    String teacherOffice;
}
