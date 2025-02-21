package com.atguigu.b_object;

public class Test03 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("Tom", 18);
        Object o = p1.clone();
        Person p2 = (Person) o; // 克隆了一个新对象

        System.out.println(p1 == p2); // 比较的是地址值 false
        System.out.println(p1.equals(p2)); // 比较的是内容 true

    }
}
