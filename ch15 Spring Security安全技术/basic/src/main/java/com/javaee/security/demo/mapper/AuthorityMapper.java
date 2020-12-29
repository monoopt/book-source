package com.javaee.security.demo.mapper;

import com.javaee.security.demo.domain.Authority;

import java.util.List;

@Mapper
public class AuthorityMapper {
    public List<Authority> getByUserId(Long id);
}
