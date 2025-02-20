package com.atguigu.i_innerclass;

public class Person {
    public void eat(){
        class Heart{
            public void beat(){
                System.out.println("心脏跳动");
            }
        }

        new Heart().beat();
    }
}
