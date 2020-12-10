package com.javaee.mybatis.relations.mapper;

import com.javaee.mybatis.relations.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from user where id=#{id}")
    public User  getById(long id);
}
