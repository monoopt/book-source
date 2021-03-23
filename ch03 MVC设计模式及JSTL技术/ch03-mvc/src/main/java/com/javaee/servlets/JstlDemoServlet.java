package com.javaee.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@WebServlet("/jstl")
public class JstlDemoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double score = 65;
        //单个变量
        req.setAttribute("score",score);

        //集合
        req.setAttribute("userList", getUserList());

        //单个对象
        req.setAttribute("user", getUser());
        req.getRequestDispatcher("/jstl-demo.jsp").forward(req,resp);

    }



    // 生成用户列表
    public List getUserList(){
        List list = new ArrayList<User>();
        String[] cities = {"广州","深圳", "上海","北京"};
        Random rand = new Random();
        for(int i =0; i<10; ++i){
            User user = new User();
            user.setUsername("user0"+i);
            user.setAge(20+i);
            user.setEmail(user.getUsername()+"@aliyun.com");
            user.setCity(cities[rand.nextInt(cities.length)]);
            list.add(user);
        }
        return list;
    }



    //生成单个用户
    public User getUser(){
         return new User("李东明", "ldm@qq.com", 22,  "深圳");
    }
}
