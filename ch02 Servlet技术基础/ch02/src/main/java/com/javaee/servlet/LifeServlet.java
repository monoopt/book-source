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
    @Override
    public void init() throws ServletException {
        System.out.println(this.getServletName()+"初始化成功！");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      System.out.println("处理get请求...");
      String dstUrl = "/testform.jsp";
//      response.sendRedirect(dstUrl);
        String str = "今天来上课每个同学加5分";
        request.setAttribute("msg", str);

        request.getRequestDispatcher(dstUrl)
                .forward(request,response);
    }

    @Override
    public void destroy() {
        System.out.println(this.getServletName()+"已经被销毁！");
    }
}

