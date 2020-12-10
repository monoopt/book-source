package com.javaee.mybatis.relations.mapper;

import com.javaee.mybatis.relations.domain.Ticket;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TickerMapperTest {

    @Autowired
    TickerMapper tickerMapper;
    @Test
    void findById() {
        Ticket ticket = tickerMapper.findById(1);
        System.out.println(ticket.getUser());
    }
}