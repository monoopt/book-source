package com.zsc.ticketsys.vo;


import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class UserRoleVo {
    Long id;             //id
    String username;
    String email;      //电子邮件
    Date createTime;  //注册时间
    Date updateTime;  //更新时间
    String registerIp;  //注册ip
    Integer enable;
    List<String> role;   //用户角色，目前只支持1个角色
}
