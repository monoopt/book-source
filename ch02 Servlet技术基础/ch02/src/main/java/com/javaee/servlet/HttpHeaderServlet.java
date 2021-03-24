package com.javaee.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 获取Http头部字段信息
 */
@WebServlet("/httpHeader")
public class HttpHeaderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        //todo；代码需要修改
        out.println("<h2>HTTP 头部信息</h2><hr>");
        out.println("<li>客户端IP地址:"+ request.getRemoteAddr()+"</li>");
        out.println("<li>客户端端口号:"+ request.getRemotePort()+"</li>");
        out.println("<li>服务器IP地址:"+ request.getLocalAddr()+"</li>");
        out.println("<li>服务器端口号:"+ request.getServerPort()+"</li>");
        out.println("<li>资源URL地址:"+ request.getRequestURL()+"</li>");
        out.println("<li>浏览器类型:"+ request.getHeader("User-Agent")+"</li>");
        out.println("<li>Method:"+ request.getHeader("")+"</li>");
        out.println("<li>连接类型(Connection):"+ request.getRemoteAddr()+"</li>");
        out.println("<li>报文头部(Content-Length):"+ request.getRemoteAddr()+"</li>");
        out.println("<li>请求来源(Origin):"+ request.getRemoteAddr()+"</li>");
        out.println("<li>浏览器所访问的前一个页面(referer):"+ request.getRemoteAddr()+"</li>");
        out.println("<li>接收的编码方式(Accept-Encoding):"+ request.getRemoteAddr()+"</li>");
        out.println("<li>接收对字符集(Accept-Charset):"+ request.getRemoteAddr()+"</li>");
        out.println("<li>接收的语言(Accept-Language):"+ request.getRemoteAddr()+"</li>");
        out.println("<li>认证信息(Authorization):"+ request.getRemoteAddr()+"</li>");
        out.println("<li>请求体的多媒体类型 (Content-Type):"+ request.getRemoteAddr()+"</li>");
        out.println("<li>Cookie(Cookie):"+ request.getRemoteAddr()+"</li>");
        out.println("<li>缓存方式(Cache-Control):"+ request.getRemoteAddr()+"</li>");
        out.println("<li>压缩方式(Content-Encoding):"+ request.getRemoteAddr()+"</li>");
    }
}
