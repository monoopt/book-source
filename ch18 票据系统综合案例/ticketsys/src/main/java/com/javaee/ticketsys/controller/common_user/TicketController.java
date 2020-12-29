package com.javaee.ticketsys.controller.common_user;

import com.javaee.ticketsys.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * 普通用户用于提交票据，查看票据和编辑更新票据
 */
@RestController
public class TicketController {
    @Autowired
    TicketService ticketService;



}
