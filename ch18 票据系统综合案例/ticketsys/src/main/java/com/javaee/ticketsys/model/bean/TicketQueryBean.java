package com.javaee.ticketsys.model.bean;

import lombok.Data;

@Data
public class TicketQueryBean {
    String subject;
    String ticketType;
    String money;
}
