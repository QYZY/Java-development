package com.atguigu.f_super_this;

public class Test {
    public static void main(String[] args) {
        Zi zi = new Zi();
        System.out.println("----------");
        Zi zi1 = new Zi(10);
        System.out.println("----------");
        Zi zi2 = new Zi();
        zi2.method();
    }
}
