package com.javaee.property.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MsgController {
    @Autowired
    Singer singer;

    @GetMapping("th1")
    public String toTh1(Model model){
        String text ="晚上好";
        model.addAttribute("msg", text);

        model.addAttribute("singer", singer);
        return "th_test";
    }
}
