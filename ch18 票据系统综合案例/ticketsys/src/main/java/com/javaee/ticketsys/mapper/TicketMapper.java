package com.javaee.ticketsys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.javaee.ticketsys.model.Ticket;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TicketMapper extends BaseMapper<Ticket> {

}
