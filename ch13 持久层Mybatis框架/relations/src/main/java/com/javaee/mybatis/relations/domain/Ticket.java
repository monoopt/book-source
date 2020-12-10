package com.javaee.mybatis.relations.domain;

import lombok.Data;

import java.util.Date;
import java.util.List;


@Data
public class Ticket {
    Long id;          //票据id
    String companyName; //客户名称
    double money;      //票据金额
    String subject;    //票据主题
    String body;       //票据主要内容
    String ticketType;
    String submitter;   //提交者名字
    Date submitDate;   //提交时间
    int status;  //
    List<AttachFile> attachFiles;   //票据附件
    User user;
    
    public  Ticket(){

    }
    //setter  和getter方法

    public Ticket(String companyName, double money, String subject,
                  String body, String type) {
        this.companyName = companyName;
        this.money = money;
        this.subject = subject;
        this.body = body;
        this.ticketType = type;
    }
}
