package com.atguigu;

import java.util.Scanner;

public class StudentView {
    /*
    会进行反复输入，没必要每次都创建一个新的Scanner对象，所以将其定义为一个属性
     */ Scanner sc = new Scanner(System.in);

    /*
    老数组，用于存储学生信息，最多50个人
     */ Student[] students = new Student[50];

    /*
    定义count属性，用于记录学生的数量，防止遍历时出现null
     */ int count = 0;

    /*
    新数组，删除元素时需要将剩下的元素复制到新数组中，长度为老数组的长度-1
     */ Student[] newStudents = new Student[students.length - 1];


    /*
    start 用于展示页面以及调用对应的功能
     */
    public void start() {
        while (true) {
            System.out.println("-----------------学生管理系统-----------------");
            System.out.println("1.添加学生");
            System.out.println("2.修改学生");
            System.out.println("3.删除学生");
            System.out.println("4.查看学生");
            System.out.println("5.退出系统");
            System.out.print("请输入你的选择（1-5）：");

            int num = sc.nextInt();
            System.out.println("--------------------------------------------");

            switch (num) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    updateStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    findAllStudent();
                    break;
                case 5:
                    System.out.println("确定要退出吗？（y/n）");
                    String flag = sc.next();
                    if ("y".equals(flag)) {
                        System.out.println("感谢您的使用！");
                        System.exit(0);
                    }
                    break;

            }

        }


    }

    private void findAllStudent() {
        System.out.println("学号\t姓名\t年龄\t性别");

        /*
        排序是为了防止重复添加出现乱序
         */
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (students[j].getId() > students[j + 1].getId()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        // 如果count为0，说明没有学生信息
        if (count == 0) {
            System.out.println("没有学生信息！");
        } else {
            for (int i = 0; i < count; i++) {
                Student student = students[i];
                System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getAge() + "\t" + student.getSex());
            }
        }
    }

    private void deleteStudent() {
        // 1. 要删除的学生学号
        System.out.println("请输入要删除的学生学号：");
        int id = sc.nextInt();

        // 2. 根据学号找到索引
        int removeIndex = ArrayUtils.findIndexById(students, id, count);

        // 3. 复制被删除元素之前的元素
        System.arraycopy(students, 0, newStudents, 0, removeIndex);

        // 4. 复制被删除元素之后的元素
        System.arraycopy(students, removeIndex + 1, newStudents, removeIndex, count - removeIndex - 1);

        // 5. 将新数组赋值给老数组
        students = newStudents;

        // 6. 更新count
        count--;

        System.out.println("删除成功！");


    }

    private void updateStudent() {
        // 要修改的学生学号
        System.out.println("请输入要修改的学生学号：");
        int id = sc.nextInt();

        /*
        需要先根据id找到索引
         */
        int updataIndex = ArrayUtils.findIndexById(students, id, count);

        System.out.println("请输入新的学生姓名：");
        String name = sc.next();
        System.out.println("请输入新的学生年龄：");
        int age = sc.nextInt();
        System.out.println("请输入新的学生性别：");
        String sex = sc.next();

        Student student = new Student(id, name, age, sex);
        students[updataIndex] = student;
        System.out.println("修改成功！");
    }

    private void addStudent() {
        // 1. 键盘输入学生信息
        System.out.println("请输入学生学号：");
        int id = sc.nextInt();
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        System.out.println("请输入学生性别：");
        String sex = sc.next();

        // 2. 将信息封装到学生对象中
        Student student = new Student(id, name, age, sex);

        // 3. 将学生对象存储到数组中
        students[count] = student;

        // 4. 更新count
        count++;

        System.out.println("添加成功！");
    }
}
