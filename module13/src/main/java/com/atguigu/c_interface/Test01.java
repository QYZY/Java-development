package com.atguigu.c_interface;

public class Test01 {
    public static void main(String[] args) {

        // 创建一个数组
        Student[] students = new Student[3];
        Student s1 = new Student("Tom", 80);
        Student s2 = new Student("Jerry", 90);
        Student s3 = new Student("Jack", 70);
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // 排序
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].compareTo(students[j + 1]) > 0) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        // 遍历
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }


    }
}
