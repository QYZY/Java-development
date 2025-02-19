package com.atguigu.c_interface;

public class Mouse implements USB {
    @Override
    public void methodDefault() {
        System.out.println("Mouse类重写了USB接口的默认方法");
    }
}
