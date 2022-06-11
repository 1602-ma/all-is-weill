package com.feng.day07;

import java.util.Arrays;

/**
 * @author f
 * @date 2022/4/26 21:28
 */
public class Test01 {
    public static void main(String[] args) {
        int[] arr = {3, 7, 4, 6};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j ++) {
                if (arr[j] > arr[j + 1]) {
                    int temp  =arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
