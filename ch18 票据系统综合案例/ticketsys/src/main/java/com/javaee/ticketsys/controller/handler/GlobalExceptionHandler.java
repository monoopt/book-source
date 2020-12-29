package com.javaee.ticketsys.controller.handler;


import com.javaee.ticketsys.model.bean.ResponseBean;
import com.javaee.ticketsys.model.bean.ResultCode;
//import com.javaee.ticketsys.exceptions.UserDeleteException;
import com.javaee.ticketsys.exceptions.UserNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @create 2020/3/3
 * 全局异常处理
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    /**-------- 通用异常处理方法 --------**/
    @ResponseBody
    @ExceptionHandler
    public ResponseBean error(Exception e) {
        log.error(e.getMessage());
        e.printStackTrace();
        return ResponseBean.fail(e.getMessage());
    }

    /**-------- 指定异常处理方法 --------**/
    @ExceptionHandler(NullPointerException.class)
    @ResponseBody
    public ResponseBean error(NullPointerException e) {
        return ResponseBean.setStatus(ResultCode.ERROR);
    }

    /**-------- 自定义定异常处理方法 --------**/
    @ExceptionHandler(UserNotFoundException.class)
    @ResponseBody
    public ResponseBean error(UserNotFoundException e) {
        return ResponseBean.fail(e.getErrorMsg());
    }

//    @ExceptionHandler(UserDeleteException.class)
//    @ResponseBody
//    public ResponseBean deleteUserError(UserDeleteException e) {
//        return ResponseBean.fail(e.getErrorMsg());
//    }
}
