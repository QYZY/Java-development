package com.atguigu;

public class Test2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[8];

        System.arraycopy(arr1, 0, arr2, 0, 3);

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }
}
