package com.springioc.demo.xml;

public class ChineseGreeting implements Greeting {
    public void sayHello() {
        System.out.println("您好!");
        System.out.println("今天天气很好，吃饭了吗？准备出门吗？");
        System.out.println("再见!");
    }
}
