//package com.javaee.ticketsys.service.impl;
//
//import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
//import com.github.pagehelper.PageInfo;
//import com.javaee.ticketsys.model.Ticket;
//import com.javaee.ticketsys.mapper.TicketMapper;
//import com.javaee.ticketsys.model.bean.PageBean;
//import com.javaee.ticketsys.service.TicketService;
//import org.springframework.cache.annotation.CacheConfig;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//
//@CacheConfig(cacheNames = "ticket")
//@Transactional
//@Service
//public class TicketServiceImpl extends ServiceImpl<TicketMapper, Ticket> implements TicketService {
//
//    @Override
//    public PageInfo<Ticket> query(PageBean pageBean, Ticket ticket) {
//        return null;
//    }
//
//    @Override
//    public PageInfo<Ticket> listByStatus(int status) {
//        return null;
//    }
//
//    @Override
//    public void changeStatus(Long id, int status) {
//
//    }
//
//    @Override
//    public void delete(Long id) {
//
//    }
//
//    @Override
//    public Ticket getById(Long id) {
//        return null;
//    }
//
//    @Override
//    public Ticket update(Ticket ticket) {
//        return null;
//    }
//
//    @Override
//    public void add(Ticket ticket) {
//
//    }
//}
