package com.atguigu.a_exception;

import java.io.FileWriter;
import java.io.IOException;

public class Demo09Test {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("day13_exception_object\\1.txt");
            fw.write("哈哈哈");//假如这里写失败或者写成功了
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}