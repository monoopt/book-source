package com.javaee.ticketsys.exceptions;


import lombok.Data;

@Data
public class OpsNoExistException extends RuntimeException {
    String errorMsg = "该操作不允许!";
    public OpsNoExistException() {
    }
}
