package com.atguigu.k_exam;

public class Notebook {
    // 开机
    public void powerOn() {
        System.out.println("笔记本电脑开机");
    }

    // 使用USB设备
    public void useUSB(USB usb) {
        usb.open();
        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.click();
        } else if (usb instanceof Keyboard) {
            Keyboard keyboard = (Keyboard) usb;
            keyboard.type();
        }
        usb.close();
    }

    // 关机
    public void powerOff() {
        System.out.println("笔记本电脑关机");
    }
}
