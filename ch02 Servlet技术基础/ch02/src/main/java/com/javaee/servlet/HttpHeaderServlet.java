package com.javaee.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/httpHeader")
public class HttpHeaderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h2>HTTP 头部信息</h2><hr>");
        out.println("<ul><li>客户端IP地址:"+ request.getRemoteAddr()+"</li>");
        out.println("<ul><li>客户端端口号:"+ request.getRemotePort()+"</li>");
        out.println("<ul><li>服务器IP地址:"+ request.getLocalAddr()+"</li>");
        out.println("<ul><li>服务器端口号:"+ request.getServerPort()+"</li>");
        out.println("<ul><li>当前URL地址:"+ request.getRequestURL()+"</li>");
        out.println("<ul><li>客户端浏览器:"+ request.getHeader("User-Agent")+"</li>");
        out.println("<ul><li>客户端编码类型:"+ request.getHeader("")+"</li>");
        out.println("<ul><li>客户端IP地址:"+ request.getRemoteAddr()+"</li>");
    }
}
