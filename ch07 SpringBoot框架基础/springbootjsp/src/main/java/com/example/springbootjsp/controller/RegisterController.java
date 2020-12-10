package com.example.springbootjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RegisterController {
    @GetMapping("reg")
    public String toReg(){
        return "register";
    }
    
    @PostMapping("register")
    @ResponseBody
    public String register(@RequestParam String username,
                           @RequestParam Integer age,
                           @RequestParam String stuClass){
        System.out.println("提交的数据为:"+username+age+stuClass);
        return "OK";
    }
}
