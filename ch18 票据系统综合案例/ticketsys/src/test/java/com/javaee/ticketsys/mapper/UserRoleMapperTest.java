package com.javaee.ticketsys.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class UserRoleMapperTest {
    @Autowired
    UserRoleMapper userRoleMapper;

    @Test
    void deleteRolesByUserId() {
    }

    @Test
    void deleteBatchUserRole() {
        Long[]  userIds={277L,278L,279L, 225L};

        System.out.println(userRoleMapper.deleteBatchUserRole(userIds));

    }
}