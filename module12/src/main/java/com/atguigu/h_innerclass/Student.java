package com.atguigu.h_innerclass;

public class Student {
    String name = "Tom";

    class Heart{
        String name = "心脏";

        public void display(String name){
            System.out.println(name); // 内部类的局部变量
            System.out.println(this.name); // 内部类的成员变量
            System.out.println(Student.this.name); // 外部类的成员变量
        }
    }
}
