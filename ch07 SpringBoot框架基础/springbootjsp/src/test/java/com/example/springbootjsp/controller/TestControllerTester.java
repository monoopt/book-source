package com.example.springbootjsp.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class TestControllerTester {
    @Autowired
    TestController tester;

    @Test
    public void msg(){
        String msg = tester.msg();
        Assert.isNull(msg);
        System.out.println(msg);
    }

    @Test
    public void mul(){
        double res =tester.mul(19,19);
        System.out.println(res);
    }
}
