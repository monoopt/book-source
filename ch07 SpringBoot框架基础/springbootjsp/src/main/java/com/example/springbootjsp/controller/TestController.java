package com.example.springbootjsp.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Controller 和@Component等同
 */
@Controller
public class TestController {
    @GetMapping("test")
    @ResponseBody
    public  String msg(){
        return "您好,Springboot";
    }
    
    public double mul(double a, double b){
        return a*b;
    }
    
    @GetMapping("jsp")
    public String hello(Model model){
        String message = "你好！Springboot!";
        model.addAttribute("msg", message);
        return "hello";
    }
}
