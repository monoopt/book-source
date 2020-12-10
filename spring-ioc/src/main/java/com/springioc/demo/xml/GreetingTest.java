package com.springioc.demo.xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingTest {
    public static void main(String[] args) {
//        Greeting greeting = new EnglishGreeting();

        System.out.println("1.演示简单XML装配Bean对象=======");
        BeanFactory bf = new ClassPathXmlApplicationContext("spring-config.xml");
        Greeting greeting = (Greeting) bf.getBean("greeting");
        greeting.sayHello();

        Greeting greeting1 = (Greeting)bf.getBean("greeting");
        Greeting greeting2 = (Greeting)bf.getBean("greeting");

        System.out.println("对象greeting1是否等于greeting2:"+ (greeting1 == greeting2));
    }
}