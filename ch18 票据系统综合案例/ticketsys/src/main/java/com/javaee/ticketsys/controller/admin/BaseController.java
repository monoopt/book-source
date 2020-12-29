package com.javaee.ticketsys.controller.admin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 封装控制器的基本功能
 */
@RestControllerAdvice
@Slf4j
public class BaseController {
    @Autowired
    protected  HttpServletRequest request;

    @Autowired
    protected HttpSession session;

    /**
     * 共springSecurity上下文中获取当前登录的用户信息
     */

}
