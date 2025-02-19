package com.atguigu.e_interface;

public class InterfaceImpl implements InterfaceA, InterfaceB {
    @Override
    public void method() {
        System.out.println("InterfaceImpl类重写了InterfaceA接口的method方法");
    }
}
