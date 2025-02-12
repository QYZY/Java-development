package com.atguigu;

public class ArrayUtils {
    private ArrayUtils() {
    }

    public static int findIndexById(Student[] students, int id, int count) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
