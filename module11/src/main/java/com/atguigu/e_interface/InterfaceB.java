package com.atguigu.e_interface;

public interface InterfaceB {
    public abstract void method();

    public default void methodDefault() {
        System.out.println("InterfaceB接口的默认方法");
    }
}
