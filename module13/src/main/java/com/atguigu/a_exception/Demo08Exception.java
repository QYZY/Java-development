package com.atguigu.a_exception;


import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo08Exception {
    public static void main(String[] args) {
        String s = "a.txt";


        try {
            add(s);
        } catch (IOException e) {
            e.printStackTrace(); // 打印详细异常信息
        } finally {
            System.out.println("必须执行");
        }

    }

    private static void add(String s) throws FileNotFoundException ,IOException {
        if (s == null) {
            throw new IOException("IO异常");
        }
        if (!s.endsWith(".txt")) {
            throw new FileNotFoundException("文件找不到");
        }
        System.out.println("添加功能");

    }


}

