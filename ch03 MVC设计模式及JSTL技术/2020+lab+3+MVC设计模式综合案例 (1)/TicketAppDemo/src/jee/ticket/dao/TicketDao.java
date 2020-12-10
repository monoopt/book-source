package jee.ticket.dao;

import jee.ticket.domain.Ticket;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TicketDao {
    //使用静态变量，只保存一份副本
    
    //静态变量， 票据ID号，全局唯一
   
    //构造函数
    public  TicketDao(){
        //只初始化1次
        if(ticketList.size()==0) {
   
        }
    }
    //根据id查找ticket对象
    public Ticket findById(long id){
     
    }
    //查找所有的ticket对象
    public List findAll(){
        
    }

    // 添加票据,使用同步加锁
    public synchronized void insert(Ticket ticket){
        //生成票据id
        
    }
    //删除票据
    public void deleteById(long id) {
        
        }
    }
}
