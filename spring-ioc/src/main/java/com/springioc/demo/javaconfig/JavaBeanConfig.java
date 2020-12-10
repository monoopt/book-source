package com.springioc.demo.javaconfig;

import com.springioc.demo.autoscan.CdPlayer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//声明为配置类,该配置类会被Spring自动扫描
@Configuration
//配置要扫描的Bean的路径
@ComponentScan(basePackages = "com.springioc.demo")
public class JavaBeanConfig {

    //测试函数
    public static void main(String[] args) {
        //使用AnnotationConfigApplicationContext来初始化Bean容器，无须读取xml配置文件
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaBeanConfig.class);
        CdPlayer cdPlayer = (CdPlayer)context.getBean("cdPlayer");
        cdPlayer.playCD();
    }
}
