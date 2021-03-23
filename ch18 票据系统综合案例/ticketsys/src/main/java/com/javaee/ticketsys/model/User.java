package com.javaee.ticketsys.model;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Set;


@Data
public class User{
    Long id;             //id
    String username;   //用户名
    String password;   //密码
    String email;      //电子邮件
    Date createTime;  //注册时间
    Date updateTime;  //更新时间
    String registerIp;  //注册ip
    Integer enable;      //表示用户状态、status=0表示用户停用，status=1表示用户激活

    @TableField(exist = false)
    Set<Role> roles;
}

