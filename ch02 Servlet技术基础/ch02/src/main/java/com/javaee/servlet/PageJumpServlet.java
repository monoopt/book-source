package com.javaee.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/pagejump")
public class PageJumpServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String type = request.getParameter("type");
        if (type==null || type.isEmpty()){
            response.setCharacterEncoding("utf-8");
            response.setContentType("text/html");
            response.getWriter().println("请输入页面跳转类型！(url?type=r或者f)");
            return;
        }
        String dstUrl = "/index.jsp";
        if (type.equals("r")){
            response.sendRedirect(dstUrl);
        }else if(type.equals("f")) {
            // 传递对象
            String msg ="来自于与Servlet的问候";
            request.setAttribute("msg", msg);
            request.getRequestDispatcher(dstUrl).forward(request, response);
        }
    }
}
