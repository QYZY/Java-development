package com.atguigu.b_object;

import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) {
        Person p1 = new Person("Tom", 12);
        Person p2 = new Person("Tom", 12);
        System.out.println(p1==p2); // false
        System.out.println(p1.equals(p2)); // false -> true (重写equals方法后)

        System.out.println("=============");

        ArrayList<String> list = new ArrayList<String>();
        System.out.println(p1.equals(list));

        System.out.println("=============");

        System.out.println(p1.equals(null));

        System.out.println("=============");

        System.out.println(p1.equals(p1));

        System.out.println("=============");

        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1==s2); // false
        System.out.println(s1.equals(s2)); // true
    }
}
