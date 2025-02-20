package com.atguigu.h_innerclass;

public class Person {
    public void eat() {
        System.out.println("人在吃饭");
    }

    class Heart{
        public void beat(){
            System.out.println("心脏跳动");
        }
    }
}
