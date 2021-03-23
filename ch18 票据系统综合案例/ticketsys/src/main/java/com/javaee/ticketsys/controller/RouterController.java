package com.javaee.ticketsys.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 用于页面跳转
 */
@Controller
public class RouterController {

    //跳转到管理员页面
    @GetMapping("/admin")
    public String toAdmin() {
        return "backend/user/list";
    }

    //跳转到普通用户页面
    @GetMapping("/common")
    public String toCommonUser() {
        return "common/user/list";
    }
}
