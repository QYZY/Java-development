package com.atguigu.a_exception;

public class Demo03Exception {
    public static void main(String[] args) {
        String s = "a.txt1";
        method(s);
    }

    public static void  method (String s) {
        if (!s.endsWith(".txt")) {
            throw new NullPointerException();
        }
        System.out.println("执行");


    }
}
