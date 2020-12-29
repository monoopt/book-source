package com.javaee.ticketsys.exceptions;


import lombok.Data;

@Data
public class UserDeleteException extends RuntimeException {
    String errorMsg = "用户删除异常!";
    public UserDeleteException() {
    }
}
