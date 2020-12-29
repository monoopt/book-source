package com.javaee.mybatis.crud.mapper;

import com.javaee.mybatis.crud.domain.Teacher;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TeacherMapper {
    //查询所有
    public List<Teacher> listAll();

    //根据id查询
    public Teacher getById(Long id);

    //新增记录
    public int add(Teacher  teacher);

    //删除记录
    public int delete(Long id);

    //更新信息
    public int update(Teacher teacher);

    //模糊查询
    public List<Teacher> listLikeName(String name);
}
