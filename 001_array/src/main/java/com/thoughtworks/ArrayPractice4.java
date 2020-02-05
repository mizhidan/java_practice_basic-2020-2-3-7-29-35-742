package com.thoughtworks;

public class ArrayPractice4 {

    /**
     * 完成本方法实现功能: 将一个数字插入到给定的已经排好序的数组中，要求插入以后数组依然是有序的
     */
    public static int[] insert(int number) {
        int[] array = new int[]{1, 20, 50, 100};
        int[] newArray = new int[array.length + 1];
        boolean flag = false;
        for (int index = 0; index < newArray.length; ++index) {
            if (flag == true) {
                newArray[index] = array[index - 1];
            } else {
                if(index == newArray.length - 1) {
                    newArray[index] = number;
                    break;
                }
                if (number > array[index]) {
                    newArray[index] = array[index];
                } else {
                    newArray[index] = number;
                    flag = true;
                }
            }
        }
        return newArray;
    }
}
