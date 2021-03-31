package com.javaee.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

/**
 * 说明：演示通过Servlet，将数据从控制器传递到视图层,然后在视图层完成数据渲染和展示
 */

@WebServlet("/jstl")
public class JstlServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double score = 65;
        //传递单个变量
        req.setAttribute("score", score);
        //传递列表
        req.setAttribute("userList", getUserList());
        //单个对象
        req.setAttribute("user", getUser());
        //传递集合
        Map products = new HashMap<>();
        products.put("1001", "羽毛球鞋");
        products.put("1002", "户外速干衣");
        products.put("1003", "抓绒冲锋衣");
        products.put("1003", "休闲背包");
        req.setAttribute("productMap", products);


        //视图层页面
        String dstUrl = "/view.jsp";
        req.getRequestDispatcher(dstUrl).forward(req, resp);
    }

    // 生成用户列表
    public List getUserList() {
        List list = new ArrayList<User>();
        String[] cities = {"广州", "深圳", "上海", "北京"};
        Random rand = new Random();
        for (int i = 0; i < 10; ++i) {
            User user = new User();
            user.setUsername("user0" + i);
            user.setAge(20 + i);
            user.setEmail(user.getUsername() + "@aliyun.com");
            user.setCity(cities[rand.nextInt(cities.length)]);
            list.add(user);
        }
        return list;
    }


    //生成单个用户
    public User getUser() {
        return new User("李东明", "ldm@qq.com", 22, "深圳");
    }
}
