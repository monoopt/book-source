package com.javaee.ticketsys.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 封装控制器的基本功能
 */
@Slf4j
public class BaseController {
    @Autowired
    protected  HttpServletRequest request;

    @Autowired
    protected HttpSession session;
    //....
}
