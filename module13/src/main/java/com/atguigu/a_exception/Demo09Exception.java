package com.atguigu.a_exception;

public class Demo09Exception {
    public static void main(String[] args) {
        int result = method();
        System.out.println(result);
    }

    public static int method() {
        try{
            String s  = null;
            System.out.println(s.length()); // NullPointerException
            return 2;
        } catch (Exception e) {
            return 1;
        } finally {
            System.out.println("一定执行");
            return 3;
        }
    }
}
