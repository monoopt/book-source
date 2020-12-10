package jee.ticket.domain;

import java.util.Date;

public class Ticket {
    Long id;          //票据id
    String customerName; //客户名称
    double money;      //票据金额
    String subject;    //票据主题
    String body;       //票据主要内容
    String type;



    Date submitDate;   //提交时间
    //setter 和getter方法

    public Ticket(String customerName, double money, String subject,
                  String body, String type) {

        this.customerName = customerName;
        this.money = money;
        this.subject = subject;
        this.body = body;
        this.type = type;
    }

   
}
