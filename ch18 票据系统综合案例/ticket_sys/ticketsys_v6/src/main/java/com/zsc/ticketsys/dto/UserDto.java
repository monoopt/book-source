package com.zsc.ticketsys.dto;

import lombok.Data;
import lombok.Getter;

/**
 * 用于接收客户端传输的用户对象
 * 为了简化编程，目前没有用到
 */
@Data
public class UserDto {
    Long userId;
    String username;
    Long  roleId;
    String email;
}
