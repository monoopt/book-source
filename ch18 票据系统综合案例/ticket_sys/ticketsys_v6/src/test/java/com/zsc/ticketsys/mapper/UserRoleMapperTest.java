package com.zsc.ticketsys.mapper;

import static org.junit.jupiter.api.Assertions.*;

import com.zsc.ticketsys.entity.UserRole;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
class UserRoleMapperTest {
    @Resource
    UserRoleMapper userRoleMapper;
    @Test
    public  void testInsert(){
        UserRole userRole = new UserRole();
        userRole.setRoleId(2L);
        userRole.setUserId(40L);
        userRoleMapper.insert(userRole);
        System.out.println(userRole.getId());
    }
}
