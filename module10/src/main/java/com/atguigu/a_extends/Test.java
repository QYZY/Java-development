package com.atguigu.a_extends;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "张三";
        teacher.age = 30;
        System.out.println(teacher.name + "..." + teacher.age);
        teacher.work();

        Manager manager = new Manager();
        manager.name = "李四";
        manager.age = 35;
        System.out.println(manager.name + "..." + manager.age);
        manager.work();
    }
}
