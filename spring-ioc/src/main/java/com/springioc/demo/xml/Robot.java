package com.springioc.demo.xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Robot {
    double price;
    String name;

//    getter方法，用于bean属性注入
    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGreeting(Greeting greeting) {
        this.greeting = greeting;
    }

    Greeting greeting;

    public void introduce(){
        System.out.println("2.演示Bean的属性装配=======");
        System.out.println("您好，我的名字:"+ name);
        System.out.println("我的价格:"+ price);
        System.out.println("我可以使用不同的问候语:");
        greeting.sayHello();
    }

    public static void main(String[] args) {
        BeanFactory bf = new ClassPathXmlApplicationContext("spring-config.xml");

        Robot robot = (Robot) bf.getBean("robot");
        robot.introduce();

    }
}
