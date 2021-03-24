package com.javaee.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/userinfo")
public class UserFormServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        //获取用户表单数据
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        String age = request.getParameter("age");
        String heightStr = request.getParameter("height");
        String email = request.getParameter("email");
        String major = request.getParameter("major");
        String remark = request.getParameter("remark");
        String[] hobby = request.getParameterValues("hobby");
        String[] cellphone = request.getParameterValues("cellphone");
        //设置输出编码类型和文档类型
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        //输出流
        PrintWriter out = response.getWriter();
        double height;
        //对height进行类型转换，并检测异常
        try {
            height = Double.parseDouble(heightStr);
        } catch (Exception e) {
            out.println("类型转换异常！");
            return;
        }

        out.println("用户提交数据如下：<hr>");
        out.println("name=" + name
                + "<br>password: " + password
                + "<br>age: " + age
                + "<br>height: " + (height / 100)
                + "米<br>email: " + email
                + "<br>major: " + major
                + "<br>remark: " + remark + "<p>");
        out.println("hobby:");
        for (String s : hobby) {
            out.println(s + ", ");
        }
        out.println("<p>cellphone:");

        for (String number : cellphone) {
            out.println(number + ",");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
