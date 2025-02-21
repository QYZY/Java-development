package com.atguigu.a_exception;

import java.util.Scanner;

public class Demo11Exception {
    public static void main(String[] args) {
        // 1. 定义一个用户名，代表已注册的用户
        String username = "root";

        // 2. 创建Scanner对象，输入用户名
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = sc.next();

        // 3. 判断用户名是否一致
        if (name.equals(username)) {
            System.out.println("登录成功");
        } else {
            // 4. 抛出异常
            try {
                throw new LoginUserException("登录失败，用户名不存在");
            } catch (Exception e) {

            }
        }
    }

}


