package com.zsc.ticketsys.exception;


import lombok.Data;

@Data
public class UserDeleteException extends RuntimeException {
    String errorMsg = "用户删除异常!";
    public UserDeleteException() {
    }
}
