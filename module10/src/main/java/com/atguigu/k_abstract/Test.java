package com.atguigu.k_abstract;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("张三", 30);
        System.out.println(teacher.getName() + " " + teacher.getAge());
        teacher.work();
    }
}
