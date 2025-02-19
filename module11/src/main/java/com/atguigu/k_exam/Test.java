package com.atguigu.k_exam;

public class Test {
    public static void main(String[] args) {
        Notebook notebook = new Notebook();

        Mouse mouse = new Mouse();
        notebook.powerOn();
        notebook.useUSB(mouse);
        notebook.powerOff();

        System.out.println("===============");

        Keyboard keyboard = new Keyboard();
        notebook.powerOn();
        notebook.useUSB(keyboard);
        notebook.powerOff();

    }
}
