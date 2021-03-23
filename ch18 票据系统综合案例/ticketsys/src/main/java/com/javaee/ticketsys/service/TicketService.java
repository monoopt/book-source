package com.javaee.ticketsys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.javaee.ticketsys.model.Ticket;
import com.javaee.ticketsys.model.bean.PageBean;
import com.javaee.ticketsys.model.bean.TicketQueryBean;

public interface TicketService extends IService<Ticket> {

    /*分页查询*/
    public PageInfo<Ticket> query(TicketQueryBean queryBean, PageBean pageBean);
    /*根据状态查询*/
    public PageInfo<Ticket> listByStatus(int status);



    /*将状态修改新的状态*/
    public void changeStatus(Long id, int status);

    public void delete(Long[] ids);

    /*根据id查询*/
    public Ticket getById(Long id);

//
    public Ticket update(Ticket ticket);
//
    public void add(Ticket ticket);
}
