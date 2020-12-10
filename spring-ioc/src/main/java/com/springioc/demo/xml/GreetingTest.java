package com.springioc.demo.xml;

public class GreetingTest {
    public static void main(String[] args) {
        Greeting greeting = new ChineseGreeting();
        greeting.sayHello();
    }
}
