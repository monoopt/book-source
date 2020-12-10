package com.example.demo.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @GetMapping("/book")
    public String getBookName(){
        return "Java,Sp0099900ringboo9999t的第一个程序!400000";
    }
}
