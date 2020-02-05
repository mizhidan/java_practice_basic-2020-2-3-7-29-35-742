package com.thoughtworks;

import java.util.Arrays;

public class ArrayPractice1 {

    public static void main(String[] args) {
        printArrayReverse();
    }

    /**
     * 倒序打印给定数组,打印格式为: [3,2,1]
     */
    public static void printArrayReverse() {
        int[] array = new int[]{1, 2, 3};
        int head = 0;
        int end = array.length - 1;
        for(int index = 0; index < array.length / 2; ++index) {
            int temp = array[end];
            array[end] = array[head];
            array[head] = temp;
            ++head;
            --end;
        }
        System.out.println(Arrays.toString(array).replaceAll(" ",""));
    }
}
