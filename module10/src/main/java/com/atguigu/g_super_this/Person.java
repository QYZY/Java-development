package com.atguigu.g_super_this;

import javax.management.remote.SubjectDelegationPermission;

public class Person {
    int num = 10;
    public Person() {
//        this(10);
        System.out.println("Person无参构造");

    }

    public Person(int data) {
//        super();  super 和 this 不能同时存在
        this();
        System.out.println("Person有参构造");
    }

    public void method() {
        int num = 20;
        System.out.println("Person method方法");
        System.out.println(num); // 局部变量 20
        System.out.println(this.num); // 成员变量 10
    }

    public void method01() {
        System.out.println("Person method01方法");
    }


}
