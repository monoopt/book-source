package com.javaee.servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet("/checkcode")
public class CheckCodeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int width = 100;
        int height = 30;
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
        Random random = new Random();

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics graphics = image.getGraphics();
//        // 设定图像背景色(因为是做背景，所以偏淡)
        graphics.setColor(Color.white);
        graphics.fillRect(0, 0, width, height);
        Color color = new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256));//随机字体颜色
        graphics.setColor(color);//把颜色给画笔
//        // 设置字体
        graphics.setFont(new Font("Times New Roman", Font.PLAIN, 18));

//        graphics.drawRect(0, 0, 100, 30);
        for (int i = 0; i < 4; i++) {
            int number = random.nextInt(str.length());
            String a = str.substring(number, number + 1);
            graphics.drawString(a, 20 * (i + 1), 15);
        }

        //使用画圆来加入噪点
        for(int i = 0; i < 100; i++){//99个噪点,x,y为噪点坐标
            color = new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256));//随机颜色
            graphics.setColor(color);//把颜色给画笔
            int x = random.nextInt(width);
            int y = random.nextInt(height);
            graphics.drawOval(x,y,1,1);//xy是椭圆的圆心左边，width为宽，height为高
        }

        ImageIO.write(image, "jpg", response.getOutputStream());

    }


    // 给定范围获得一个随机颜色
    Color getRandColor(int fc, int bc) {
        Random random = new Random();
        if (fc > 255)
            fc = 255;
        if (bc > 255)
            bc = 255;
        int r = fc + random.nextInt(bc - fc);
        int g = fc + random.nextInt(bc - fc);
        int b = fc + random.nextInt(bc - fc);
        return new Color(r, g, b);
    }

}
