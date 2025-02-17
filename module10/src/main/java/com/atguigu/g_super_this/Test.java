package com.atguigu.g_super_this;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("----------");
        Person person1 = new Person(1);
        System.out.println("----------");
        Person person2 = new Person();
        person2.method();

    }
}
