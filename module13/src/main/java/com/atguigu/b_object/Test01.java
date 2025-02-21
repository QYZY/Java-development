package com.atguigu.b_object;

import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) {
        Person p1 = new Person("Tom", 12);
        System.out.println(p1); // com.atguigu.b_object.Person@3b07d329
        System.out.println(p1.toString()); // com.atguigu.b_object.Person@3b07d329

        System.out.println("=============");

        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list); // [aaa, bbb, ccc]
        System.out.println(list.toString()); // [aaa, bbb, ccc]


    }
}
