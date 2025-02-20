package com.atguigu.e_final;

public class Student {
    final String name = "Tom";

    public Student() {
    }

    // 有参构造属于二次赋值
    /*public Student(String name) {
        this.name = name;
    }*/

    public String getName() {
        return name;
    }

    // set方法属于二次赋值
    /*public void setName(String name) {
        this.name = name;
    }*/
}
