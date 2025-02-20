package com.atguigu.g_innerclass;

public class Person {
    public void eat() {
        System.out.println("人在吃饭");
    }

    static class Heart{
        public void beat(){
            System.out.println("心脏跳动");
        }
    }
}
