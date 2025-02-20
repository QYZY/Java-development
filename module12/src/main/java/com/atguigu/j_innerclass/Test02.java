package com.atguigu.j_innerclass;

public class Test02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        method01(dog);
        System.out.println("==============");
        Animal animal = method02();
        animal.eat();
    }

    public static void method01(Animal animal) {
        animal.eat();
    }

    public static Animal method02() {
        return new Dog();
    }
}