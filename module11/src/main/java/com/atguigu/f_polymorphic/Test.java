package com.atguigu.f_polymorphic;

public class Test {
    public static void main(String[] args) {
        // 原始方式
        Dog dog = new Dog();
        dog.eat();
        dog.watchHouse();

        Cat cat = new Cat();
        cat.eat();
        cat.catchMouse();

        System.out.println("===============");

        // 多态方式

        Animal animal = new Dog();
        animal.eat(); // 重写的animal接收的是Dog对象，所以调用的是Dog的eat方法
        // animal.watchHouse(); // 报错，因为animal是Animal类型，没有watchHouse方法

        Animal animal1 = new Cat();
        animal1.eat(); // 重写的animal1接收的是Cat对象，所以调用的是Cat的eat方法
    }
}
