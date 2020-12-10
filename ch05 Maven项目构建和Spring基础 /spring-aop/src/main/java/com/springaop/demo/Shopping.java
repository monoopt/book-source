package com.springaop.demo;


import org.springframework.stereotype.Component;

@Component
public class Shopping {


    public void buy(){
        System.out.println("购买一件牛仔裤和一件毛衣.");
        System.out.println("到试衣间试衣");
    }
}
