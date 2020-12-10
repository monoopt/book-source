package com.springioc.demo.autoscan;


import org.springframework.stereotype.Component;

@Component
public class FantasyCD implements CompactDisc {

    String title="专辑名称:范特西";
    String artist  ="周杰伦";
    String publishedDate ="2001年9月";

    public void play() {
        System.out.println("播放专辑:"+ title+";制作人:"+artist+";发行时间:"+ publishedDate);
    }
}
