package com.atguigu.g_polymorphic;

public class Test {
    public static void main(String[] args) {
        Fu fu =  new Zi();
        System.out.println(fu.num); // 父类中的num
        fu.method(); // 子类中的method
    }
}
