package com.atguigu.c_interface;

import com.atguigu.c_interface.USB;

public class Test {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.methodDefault();

        System.out.println("----------");
        USB.methodStatic();
    }
}
 