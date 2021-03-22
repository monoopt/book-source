package com.javaee.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/userinfo")
public class FormTestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String heightStr = request.getParameter("height");
        String[] hobby = request.getParameterValues("hobby");
        String[] cellphone=request.getParameterValues("cellphone");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        //输出流
        PrintWriter out = response.getWriter();
        double height;
        //类型转换
        try {
             height = Double.parseDouble(heightStr);
        }catch (Exception e){
            out.println("类型转换异常！");
            return;
        }
        out.println("name="+name+";age="+age+";height="
                +heightStr +";hobby:");
        for (String s:hobby) {
            out.println("," + s);
        }
        for (String number: cellphone) {
            out.println(number+",");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
