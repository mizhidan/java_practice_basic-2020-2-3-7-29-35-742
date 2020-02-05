package com.thoughtworks;

public class ArrayPractice3 {

    /**
     * 完成本方法实现功能: 将一个整型数组array中值0的元素去掉，并把剩下的元素组成新的数组
     */
    public static int[] filterZero(int[] array) {
        int count = 0;
        for (int index = 0; index < array.length; ++index) {
            if (array[index] == 0) {
                ++count;
            }
        }
        int[] newArray = new int[array.length - count];
        count = 0;
        for (int index = 0; index < array.length; ++index) {
            if (array[index] != 0) {
                newArray[count++] = array[index];
            }
        }
        return newArray;
    }
}
