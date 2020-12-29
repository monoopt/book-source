package com.javaee.ticketsys.exceptions;

import lombok.Data;

@Data
public class UserNotFoundException extends RuntimeException {
    String errorMsg = "用户不存在";
    public UserNotFoundException() {
    }
}
