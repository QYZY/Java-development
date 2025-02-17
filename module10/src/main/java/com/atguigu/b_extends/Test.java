package com.atguigu.b_extends;

public class Test {
    public static void main(String[] args) {
        Fu fu = new Fu();
        System.out.println(fu.numFu);
        System.out.println(fu.num); // 父类中的num

        System.out.println("===========");
        Zi zi = new Zi();
        System.out.println(zi.numFu); // 子类继承父类的成员变量
        System.out.println(zi.numZi);
        System.out.println(zi.num); // 子类中的num

        System.out.println("===========");

        Fu fu1 = new Zi();
        System.out.println(fu1.num); // 父类中的成员变量

    }
}
