package com.zsc.ticketsys.vo;

import lombok.Data;

import java.util.Date;

@Data
public class TicketUserVo {
    Long id;
    Long userId;
    String subject;
    Date createTime;
    String companyName;
    String username;
}
