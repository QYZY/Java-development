package com.atguigu.l_abstract;

public class Test02 {
    public static void main(String[] args) {
        JavaEE javaEE = new JavaEE(1, "张三");
        javaEE.work();

        System.out.println("--------------------");

        Android android = new Android(2, "李四");
        android.work();

    }
}
