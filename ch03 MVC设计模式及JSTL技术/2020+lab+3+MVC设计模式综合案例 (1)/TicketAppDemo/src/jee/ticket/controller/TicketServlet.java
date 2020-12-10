package jee.ticket.controller;

import jee.ticket.dao.TicketDao;
import jee.ticket.domain.Ticket;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@WebServlet("/ticket")
public class TicketServlet extends HttpServlet {
    //处理GET请求
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        switch (action) {

        }
    }

    //处理POST请求
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        switch (action) {
 
        }
    }

    //添加票据
    public void createTicket(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
       
    }

    //跳转到添加票据界面
    public void toCreate(HttpServletRequest req,
                         HttpServletResponse resp) throws ServletException, IOException {
     
    }

    //删除票据
    public void delTicket(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        
        //获取票据id

        //重定向到list URL
      
    }

    //查看票据列表
    public void listTicket(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        //获取票据列表
    

    }

    //查看详情
    public void viewTicket(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        //获取票据id

        //调用dao的方法
     
        //
        
    }

}
