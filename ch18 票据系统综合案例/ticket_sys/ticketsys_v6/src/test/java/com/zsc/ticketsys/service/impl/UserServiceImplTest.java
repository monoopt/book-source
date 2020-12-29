package com.zsc.ticketsys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zsc.ticketsys.domain.PageDomain;
import com.zsc.ticketsys.entity.Role;
import com.zsc.ticketsys.entity.User;
import com.zsc.ticketsys.mapper.RoleMapper;
import com.zsc.ticketsys.service.UserService;
import org.junit.jupiter.api.Test;


import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class UserServiceImplTest {


    @Autowired
    UserService userService;
    @Autowired
    RoleMapper roleMapper;
//    @Test
//    void getUserWithRole() {
//        System.out.println(userService.getUserWithRole(1L));
//    }

    @Test
    void getUserDetails() {
        System.out.println(userService.getDetailsById(1L));
    }

    @Test
    void getDetailsByUsername() {
        System.out.println(userService.getDetailsByUsername("admin"));
//        String username = "admin";
//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        queryWrapper.eq("username", username);
//        User user = userService.getOne(queryWrapper);
//        List<Role> roles = roleMapper.listRolesByUserId(user.getId());
//        user.setRoles(roles);
//        System.out.println(user);
    }

    @Test
    void listUser() {
        PageDomain pageDomain = new PageDomain(1, 2, null, null);
        System.out.println(pageDomain.buildOrderStr());
        Integer k = null;
        User user = User.builder().username("tes").email("@").enable(k).build();
        userService.listUser(pageDomain, user).getList().stream().forEach(System.out::println);
    }

    @Test
    void getUserDetailsById() {
    }

    @Test
    void getUserDetailsByUsername() {
    }
}
