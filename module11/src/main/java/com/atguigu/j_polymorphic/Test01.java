package com.atguigu.j_polymorphic;

public class Test01 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        method(dog);

        System.out.println("===============");

        Cat cat = new Cat();
        method(cat);
    }

    public static void method(Animal animal) {
//        animal.eat();

        /*
        这里会出现类型转换异常（ClassCastException）
        传递cat对象时，animal就代表cat对象，不能强转为Dog类型

         */
//        Dog dog = (Dog) animal;
//        dog.watchHouse();

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHouse();
        } else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }
}
