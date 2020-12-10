package com.springaop.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTester {
    public static void main(String[] args) {
        BeanFactory bf = new ClassPathXmlApplicationContext("spring-config.xml");
        Shopping shopping = (Shopping) bf.getBean("shopping");
        shopping.buy();
    }
}
