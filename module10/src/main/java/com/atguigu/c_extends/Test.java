package com.atguigu.c_extends;

public class Test {
    public static void main(String[] args) {
        Fu fu = new Fu();
        fu.methodFu();
        fu.method();  // 父类中的method方法

        System.out.println("===============");
        Zi zi = new Zi();
        zi.methodFu();  // 子类继承父类的方法
        zi.methodZi();
        zi.method(); // 子类中的method方法

        System.out.println("===============");
        Fu fu1 = new Zi();
        fu1.method(); // 子类中的method方法
    }
}
