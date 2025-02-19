package com.atguigu.h_polymorphic;

public class Test02 {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();

        animal = new Cat();
        animal.eat();
        System.out.println("===============");

        Dog dog = new Dog();
        method(dog);

        Cat cat = new Cat();
        method(cat);

    }

    /*
    形参传递父类类型，可以接收任意子类对象
    传递的是哪个子类对象，就调用哪个子类对象重写的方法
     */
    public static void method(Animal animal) { // Animal animal = dog; or Animal animal = cat;
        animal.eat();
    }
}
