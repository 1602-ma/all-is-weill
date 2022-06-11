package com.feng.day07;

import java.util.Arrays;

/**
 * @author f
 * @date 2022/4/26 22:49
 */
public class Test02 {
    public static void main(String[] args) {
        int[] arr = new int[] {3,6,2,65};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j ++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
