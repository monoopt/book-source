package com.javaee.mybatis.relations.mapper;

import com.javaee.mybatis.relations.domain.Ticket;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TicketMapper {
    public Ticket findById(long id);
}
