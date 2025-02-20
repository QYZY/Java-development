package com.atguigu.l_innerclass;

public class Test01 {
    public static void main(String[] args) {
        new USB() {
            @Override
            public void open() {
                System.out.println("usb开启");
            }

            @Override
            public void close() {
                System.out.println("usb关闭");
            }
        }.open();

        System.out.println("==============");

        USB usb = new USB() {
            @Override
            public void open() {
                System.out.println("usb开启");
            }

            @Override
            public void close() {
                System.out.println("usb关闭");
            }
        };

        usb.open();
        usb.close();
    }
}

