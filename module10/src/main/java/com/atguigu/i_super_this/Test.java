package com.atguigu.i_super_this;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("张三");
        teacher.setAge(30);
        System.out.println(teacher.getName() + " " + teacher.getAge());

        System.out.println("----------");

        Manager manager = new Manager("李四", 40);
        System.out.println(manager.getName() + " " + manager.getAge());


    }
}
