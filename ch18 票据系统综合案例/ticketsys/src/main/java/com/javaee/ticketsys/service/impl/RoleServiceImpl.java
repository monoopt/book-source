package com.javaee.ticketsys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.javaee.ticketsys.model.Role;
import com.javaee.ticketsys.mapper.RoleMapper;
import com.javaee.ticketsys.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}
