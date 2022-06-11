package com.feng.day07;

import java.util.Scanner;

/**
 * @author f
 * @date 2022/4/26 22:56
 */
public class Test03 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 6, 564,3, 3, 6};
        int index = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的数字： ");
        int num = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index = i;
                break;
            }
        }
        System.out.println("要查找的位置为: " + index);
    }
}
