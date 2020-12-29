package com.zsc.ticketsys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zsc.ticketsys.entity.Ticket;
import com.zsc.ticketsys.mapper.TicketMapper;
import com.zsc.ticketsys.service.TicketService;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@CacheConfig(cacheNames = "ticket")
@Transactional
@Service
public class TicketServiceImpl extends ServiceImpl<TicketMapper, Ticket> implements TicketService {

}
