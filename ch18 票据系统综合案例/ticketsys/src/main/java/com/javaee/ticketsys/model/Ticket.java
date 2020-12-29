package com.javaee.ticketsys.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Ticket {
    Long id;              //票据id
    String companyName; //客户名称
    double money;       //票据金额
    String subject;     //票据主题
    String body;         //票据主要内容
    String ticketType;   //票据类型
    Long userId;   //提交者名字
    Date  createTime;   //提交时间
    Date updateTime;     // 审核时间
    Date approvedTime;  //审核时间
    int status;  //  审核状态
    List<AttachFile> attachFiles;   //票据附件
    User user;  //票据用户
}
