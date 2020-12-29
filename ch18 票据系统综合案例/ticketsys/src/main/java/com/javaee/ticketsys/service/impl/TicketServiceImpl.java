package com.javaee.ticketsys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.javaee.ticketsys.model.Ticket;
import com.javaee.ticketsys.mapper.TicketMapper;
import com.javaee.ticketsys.service.TicketService;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@CacheConfig(cacheNames = "ticket")
@Transactional
@Service
public class TicketServiceImpl extends ServiceImpl<TicketMapper, Ticket> implements TicketService {

}
