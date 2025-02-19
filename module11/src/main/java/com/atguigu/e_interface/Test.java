package com.atguigu.e_interface;

public class Test {
    public static void main(String[] args) {
        InterfaceImpl interfaceImpl = new InterfaceImpl();
        interfaceImpl.methodDefault();
        interfaceImpl.methodDefault(10);
    }
}
