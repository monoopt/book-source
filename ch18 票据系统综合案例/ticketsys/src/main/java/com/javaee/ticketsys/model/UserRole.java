package com.javaee.ticketsys.model;

import lombok.Data;


@Data

public class UserRole {
    Long id;
    Long userId;
    Long roleId;

    public UserRole(Long userId, Long roleId){
        this.userId = userId;
        this.roleId= roleId;
    }
}

