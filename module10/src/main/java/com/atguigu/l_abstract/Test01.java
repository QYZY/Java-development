package com.atguigu.l_abstract;

public class Test01 {
    public static void main(String[] args) {
        JavaEE javaEE = new JavaEE();
        javaEE.setId(1);
        javaEE.setName("张三");
        javaEE.work();

        System.out.println("--------------------");

        Android android = new Android();
        android.setId(2);
        android.setName("李四");
        android.work();

        System.out.println("--------------------");

        Network network = new Network();
        network.setId(3);
        network.setName("王五");
        network.work();

        System.out.println("--------------------");

        Hardware hardware = new Hardware();
        hardware.setId(4);
        hardware.setName("赵六");
        hardware.work();


    }
}
