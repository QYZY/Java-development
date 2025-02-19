package com.atguigu.b_interface;

public class Test {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.open();
        String close = mouse.close();
        System.out.println(close);
    }
}
