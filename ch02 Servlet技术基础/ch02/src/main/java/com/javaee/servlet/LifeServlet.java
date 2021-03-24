package com.javaee.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/life")
public class LifeServlet extends HttpServlet {
    static int count =0;
    @Override
    public void init() throws ServletException {
        System.out.println(this.getServletName()+"初始化完成，当前Servlet对象ID为:"+ this);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      count++;
      System.out.println("第"+count+"次get请求,处理完成...");
      response.setCharacterEncoding("UTF-8");
      response.setContentType("text/html");
      response.getWriter().println("接收到浏览器GET类型请求,处理完成！");
    }

    @Override
    public void destroy() {
        System.out.println(this.getServletName()+"已经被销毁，ID为"+this);
    }
}

