package com.javaee.property.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SingerTest {
    @Autowired
    Singer singer;

    @Test
    public void test(){
        System.out.println(singer);
    }

}