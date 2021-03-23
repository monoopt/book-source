package com.javaee.ticketsys.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Set;

/**
 * 封装控制器的基本功能
 */
@RestControllerAdvice
public class BaseController {
    /*日志记录*/
    public final Logger log = LoggerFactory.getLogger(BaseController.class);

    /**
     * 获取request对象
     */
    @Autowired
    protected  HttpServletRequest request;

    /**
     * 获取session对象
     */
    @Autowired
    protected HttpSession session;
    //....

}
