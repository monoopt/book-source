package com.springioc.demo.xml;

public class EnglishGreeting implements Greeting {
    public void sayHello() {
        System.out.println("Hello.");
        System.out.println("A nice day! What are you going to do?");
        System.out.println("Bye-Bye.");
    }
}
