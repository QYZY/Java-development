package com.atguigu.e_final;

public class Test02 {
    public static void main(String[] args) {
//        Person p1 = new Person("Tom", 20);
//        System.out.println(p1); // 地址值
//        p1 = new Person("Jerry", 30);
//        System.out.println(p1); // 地址值

        final Person p1 = new Person("Tom", 20);
        System.out.println(p1); // 地址值
//        p1 = new Person("Jerry", 30);
        p1.setName("Jerry");
        p1.setAge(30);
        System.out.println(p1); // 地址值
    }
}
