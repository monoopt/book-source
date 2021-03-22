package com.javaee.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 演示Servlet的编码方法，解决中文乱码问题
 */
@WebServlet("/encoding")
public class EncodiingServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取中文参数
        req.setCharacterEncoding("utf-8");
        String value = req.getParameter("value");
        //设置为中文编码
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html");
        // 获取输入流
        PrintWriter out = resp.getWriter();
        out.println("客户端提交的参数为:" + value);
    }
}
