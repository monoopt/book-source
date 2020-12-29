package com.zsc.ticketsys.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zsc.ticketsys.entity.User;
import com.zsc.ticketsys.entity.UserRole;
import com.zsc.ticketsys.mapper.UserMapper;
import com.zsc.ticketsys.mapper.UserRoleMapper;
import com.zsc.ticketsys.service.UserRoleService;
import com.zsc.ticketsys.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;


@Service
public class UserRoleServiceImpl  extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {

}
