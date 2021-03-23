package com.javaee.ticketsys.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用于接收前端查询参数的内部类
 */
@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class UserDto {
    String username;
    String email;
    Integer enable;
}
