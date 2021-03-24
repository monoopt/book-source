package com.javaee.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 说明：演示Http不同请求类型的包括GET, POST, DELETE, PUT等方式的HTTP请求，使用Ajax模式完成
 * 首先先访问httpmethod.html页面
 */

@WebServlet("/httpmethod")
public class HttpMethodServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        response.setCharacterEncoding("UTF-8");
        response.getWriter().println("Post类型请求,接收到的数据为:username=" + username + ";password=" + password);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().println("Get类型请求,接收到的数据为id:" + id);
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //doPut方法无法通过request.getParamter()方法获取参数值
        //需要获取输入流，封装成BufferReader字符流,然后读取数据,doDelete方法类似
        BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
        String data = br.readLine();
        System.out.println(data);
        response.setCharacterEncoding("UTF-8");
        response.getWriter().println("Put类型请求,接收到的数据为:" + data);
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));

        String data = br.readLine();
        System.out.println(data);
        response.setCharacterEncoding("UTF-8");
        response.getWriter().println("Delete类型请求,接收到的数据为:" + data);
    }
}
