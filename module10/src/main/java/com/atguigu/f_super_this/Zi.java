package com.atguigu.f_super_this;

public class Zi extends Fu{
    int num = 20;

    public Zi() {
        super(); // 调用父类无参构造
        System.out.println("子类无参构造");
    }

    public Zi(int n) {
        super(n); // 调用父类有参构造
        System.out.println("子类有参构造");
    }

    public void method() {
        super.method(); // 调用父类method方法
        System.out.println("子类method方法");
        System.out.println(num); // 子类的num
        System.out.println(super.num); // 父类的num

    }
}
