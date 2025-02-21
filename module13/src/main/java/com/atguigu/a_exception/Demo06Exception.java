    package com.atguigu.a_exception;


    import java.io.FileNotFoundException;
    import java.io.IOException;

    public class Demo06Exception {
        public static void main(String[] args)  {
            String s = "a.txt1";
            try {
    //            int [] arr = null;
    //            System.out.println(arr.length); // NullPointerException
                add(s);
            } catch (FileNotFoundException e) {
                System.out.println(e);
            }
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

