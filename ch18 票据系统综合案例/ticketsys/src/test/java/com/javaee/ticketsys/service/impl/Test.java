package com.javaee.ticketsys.service.impl;


import lombok.Data;

public class Test {

    public void handle(C1 c1){
        System.out.println(c1.getA());
        System.out.println(c1.getB());
        C2 c2 = (C2)c1;
        System.out.println(c2.getS1());
    }

    @org.junit.Test
    public  void test(){
        C2 c2 = new C2();
        c2.setA(100);
        c2.setB(200L);
        c2.setS1("hello");
        handle(c2);
    }

    @Data
    public static class C2 extends  C1{
        String s1;
    }
}

@Data
class C1 {
    int  a;
    long b;
}

class C3{
    @org.junit.Test
    public  void test1(){
        Test.C2 c2 = new Test.C2();
    }
}



