package com.atguigu.d_extends;

public class Zi extends Fu {
    public void methodZi() {
        System.out.println("子类中的methodZi方法");
    }

    @Override
    public void method() {
        System.out.println("子类中的method方法");
    }

    @Override
    public void method01(){

    }

    @Override
    public Zi method02(){
        return null;
    }

}
