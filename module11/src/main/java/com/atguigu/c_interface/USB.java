package com.atguigu.c_interface;

public interface USB {
    public default void methodDefault() {
        System.out.println("USB接口的默认方法");
    }

    public static void methodStatic() {
        System.out.println("USB接口的静态方法");
    }
}
