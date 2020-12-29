package com.zsc.ticketsys.mapper;

import com.zsc.ticketsys.entity.Role;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class RoleMapperTest {

    @Autowired
    RoleMapper roleMapper;
    @Test
    void listRolesByUserId() {
        List<Role> list = roleMapper.listRolesByUserId(70L);
        System.out.println(list);//.forEach(System.out::println);
    }
}
