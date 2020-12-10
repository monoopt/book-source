package com.springioc.demo.autoscan;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class CdPlayer {
    //自动注入NovChopinCD
    @Autowired  @Qualifier("fantasyCD")

    CompactDisc cd;
    public  void playCD(){
        cd.play();
    }

    public static void main(String[] args) {
        BeanFactory bf = new ClassPathXmlApplicationContext("spring-config.xml");
        CdPlayer cdPlayer = (CdPlayer)bf.getBean("cdPlayer");
        cdPlayer.playCD();
    }
}
