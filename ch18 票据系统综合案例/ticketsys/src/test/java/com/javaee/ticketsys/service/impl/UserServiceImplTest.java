package com.javaee.ticketsys.service.impl;

import com.javaee.ticketsys.model.bean.PageBean;
import com.javaee.ticketsys.model.dto.UserDto;
import com.javaee.ticketsys.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


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
        UserDto userDto = null; //new UserDto();
//        userQueryBean.setEmail("abc");
//        userQueryBean.setEnable(1);
//        userDto.setEnable(3);
        userService.query(userDto, pageBean);

    }

    @Test
    void updateStatusByIds() {
    }

    @Test
    void deleteBatch() {
    }
}