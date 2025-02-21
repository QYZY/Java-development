package com.atguigu.a_exception;


import java.io.FileNotFoundException;

public class Demo04Exception {
    public static void main(String[] args) throws FileNotFoundException {
        String s = "a.txt1";
        add(s);
        delete(s);
        update(s);
        find(s);
    }

    private static void add(String s) throws FileNotFoundException {
        if (!s.endsWith(".txt")) {
            throw new FileNotFoundException("文件找不到");
        }
        System.out.println("添加功能");

    }

    private static void find(String s) {
        System.out.println("查询功能");
    }

    private static void update(String s) {
        System.out.println("修改功能");
    }

    private static void delete(String s) {
        System.out.println("删除功能");
    }




}

