package com.zsc.ticketsys.mapper;

import static org.junit.jupiter.api.Assertions.*;

import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zsc.ticketsys.entity.Role;
import com.zsc.ticketsys.entity.User;
import com.zsc.ticketsys.enums.UserStatus;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class UserMapperTest {

    @Resource
    UserMapper userMapper;
    @Test
    public void testInsert(){
//        User user = User.builder().username("he_huai_wen@aliyun.com")
//                .password("123456")
//        User user = new User();
//        user.setUsername("he_huai_wen@aliyun.com");
//        user.setPassword("123456");
//        user.setEmail("longkun.guo@qlu.edu.cn");
//        user.setCreateTime(new Date());
//        user.setRegisterIp("xxx");
//        user.setUpdateTime(new Date());
//        user.setEnable(UserStatus.ENABLE.ordinal());
//        Role role = new Role();
//        role.setId(1L);
//        List<Role> roles = new ArrayList<>();
//        roles.add(role);
//
////        user.setRoles(roles);
//        userMapper.insert(user);
//        System.out.println(user.getId());
    }

    @Test
    public void test() {
        System.out.println(UserStatus.ENABLE.ordinal());
    }

    @Test
    void listUser() {
        Integer k = null;
        User user = User.builder().username("tes").email("@").enable(k).build();
//
//        Page<User> page = new Page<>(1,2);
//        page.addOrder(OrderItem.asc("username"));
//
        userMapper.listUser(user).stream().forEach(System.out::println);
    }
}
