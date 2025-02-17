package com.atguigu.j_abstract;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void drink() {
        System.out.println("狗喝水");
    }
}
