package com.atguigu.h_polymorphic;

public class Test01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.watchHouse();

        Cat cat = new Cat();
        cat.eat();
        cat.catchMouse();

        System.out.println("===============");
        method(dog);
        method(cat);
    }
    public static void method(Dog dog) {
        dog.eat();
        dog.watchHouse();
    }

    public static void method(Cat cat) {
        cat.eat();
        cat.catchMouse();
    }

}
