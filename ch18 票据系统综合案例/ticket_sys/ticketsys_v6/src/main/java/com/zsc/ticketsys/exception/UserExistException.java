package com.zsc.ticketsys.exception;


import lombok.Data;

@Data
public class UserExistException extends RuntimeException {
    String errorMsg = "用户名已经存在!";
    public UserExistException() {
    }
}
