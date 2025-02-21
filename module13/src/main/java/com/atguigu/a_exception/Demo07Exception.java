package com.atguigu.a_exception;


import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo07Exception {
    public static void main(String[] args) {
        String s = "a.txt1";
        /*try{
            add(s);
        }catch (FileNotFoundException e) {
            System.out.println(e);
        }catch (IOException e) {
            System.out.println(e);
        }*/

        /*try{
            add(s);
        }catch (IOException e) {
            System.out.println(e);
        }*/

        try{
            add(s);
        }catch (Exception e) {
            e.printStackTrace(); // 打印详细异常信息
        }
        delete(s);
        update(s);
        find(s);
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

