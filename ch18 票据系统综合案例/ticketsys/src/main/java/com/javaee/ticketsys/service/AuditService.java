package com.javaee.ticketsys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.javaee.ticketsys.model.Audit;
import com.javaee.ticketsys.model.Role;

public interface AuditService extends IService<Audit> {

    Audit getByTicketId(long ticketId);
}
