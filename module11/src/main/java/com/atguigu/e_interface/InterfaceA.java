package com.atguigu.e_interface;

public interface InterfaceA {
    public abstract void method();

    public default void methodDefault(int num) {
        System.out.println("InterfaceA接口的默认方法");
    }
}
