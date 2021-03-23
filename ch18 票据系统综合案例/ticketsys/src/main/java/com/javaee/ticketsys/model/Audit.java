package com.javaee.ticketsys.model;


import lombok.Data;

@Data
public class Audit {
    Long id;
    Long ticketId;
    Long userId;
    String comment;
}
