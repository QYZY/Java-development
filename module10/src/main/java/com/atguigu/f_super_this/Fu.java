package com.atguigu.f_super_this;

public class Fu {
    int num = 10;

    public Fu() {
        System.out.println("父类无参构造");
    }

    public Fu(int n) {
        System.out.println("父类有参构造");
    }

    public void method() {
        System.out.println("父类method方法");
    }
}
