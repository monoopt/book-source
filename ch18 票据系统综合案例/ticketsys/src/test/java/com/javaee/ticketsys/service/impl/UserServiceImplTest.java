package com.javaee.ticketsys.service.impl;

import com.javaee.ticketsys.model.bean.PageBean;
import com.javaee.ticketsys.model.dto.UserQueryBean;
import com.javaee.ticketsys.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class UserServiceImplTest {
    @Autowired
    UserService userService;

    @Test
    public  void test(){
        userService.list();
    }


    @Test
    void getDetailsByUsername() {
        userService.getDetailsByUsername("admin");
    }

    @Test
    void add() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @Test
    void queryUsers() {
        PageBean pageBean = new PageBean(1, 10, "id", "desc");
//        UserQueryBean userQueryBean = new UserQueryBean("T", "@", 1);
        UserQueryBean userQueryBean = new UserQueryBean();
//        userQueryBean.setEmail("abc");
        userQueryBean.setEnable(1);
        userService.queryUsers(pageBean, userQueryBean);

    }

    @Test
    void updateStatusByIds() {
    }

    @Test
    void deleteBatch() {
    }
}