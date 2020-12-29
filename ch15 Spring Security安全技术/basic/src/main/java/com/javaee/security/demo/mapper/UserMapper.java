package com.javaee.security.demo.mapper;


import com.javaee.security.demo.domain.User;

public interface UserMapper {
    @Select("select * from t_customer where username=#{username}")
    public User getByUsername(String username);
}
