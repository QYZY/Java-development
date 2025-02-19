package com.atguigu.i_polymorphic;

public class Test01 {
    public static void main(String[] args) {
        // 多态new对象，向上转型
        Animal animal = new Dog();
        animal.eat();
        // animal.watchHouse(); // 多态不能调用子类特有方法

        // 向下转型
        Dog dog = (Dog) animal;
        dog.eat();
        dog.watchHouse();


    }
}
