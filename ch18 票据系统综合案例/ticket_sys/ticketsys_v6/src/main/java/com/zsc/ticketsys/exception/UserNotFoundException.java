package com.zsc.ticketsys.exception;

import lombok.Data;
import lombok.Getter;

@Data
public class UserNotFoundException extends RuntimeException {
    String errorMsg = "用户不存在";
    public UserNotFoundException() {
    }
}
