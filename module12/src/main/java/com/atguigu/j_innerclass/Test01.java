package com.atguigu.j_innerclass;

public class Test01 {
    public static void main(String[] args) {

        Mouse mouse = new Mouse();
        method(mouse);

        System.out.println("==============");

        USB usb = method01();
        usb.open();
    }

    /*
    接口作为方法参数，传递实参时，传递的是实现类对象
     */
    public static void method(USB usb) {
        usb.open();
    }

    /*
    接口作为方法的返回值，返回的是实现类对象
     */
    public static USB method01() {
//        Mouse mouse = new Mouse();
//        return mouse;
        return new Mouse();
    }
}
