package com.javaee.security.demo.contoller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "index";
    }


    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
