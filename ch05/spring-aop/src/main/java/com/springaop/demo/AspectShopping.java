package com.springaop.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectShopping {

//    @Before("execution(* com.springaop.demo.Shopping.buy())")
//    public void before(){
//        System.out.println("前置通知: 推门进入服装店");

    //        System.out.println("挑选衣服");
//        System.out.println("-----------------------");
//    }
//
//    @After("execution(* com.springaop.demo.Shopping.buy())")
//    public  void after(){
//        System.out.println("-----------------------");
//
//        System.out.println("付款");
//        System.out.println("离开服装店");
//    }
//
    //使用pointcut定义切入点
    @Pointcut("execution(* com.springaop.demo.Shopping.buy())")
    public void lBuy(){

    }
//    使用Around环绕通知
    @Around("lBuy()")
    public void around(ProceedingJoinPoint joinPoint){
        System.out.println("2.使用Around环绕通知");
        System.out.println("前置通知: 推门进入服装店");
        System.out.println("挑选衣服");
        System.out.println("-----------------------");

        try {
            joinPoint.proceed();
        }catch (Throwable throwable){
            throwable.printStackTrace();
        }
        System.out.println("-----------------------");
        System.out.println("后置通知: 付款");
        System.out.println("离开服装店");
    }
}
