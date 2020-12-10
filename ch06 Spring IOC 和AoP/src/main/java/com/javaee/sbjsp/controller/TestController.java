package com.javaee.sbjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("get")
    public String test(){
        return "test";
    }
}
