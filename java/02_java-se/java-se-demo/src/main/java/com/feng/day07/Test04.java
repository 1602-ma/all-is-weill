package com.feng.day07;

/**
 * @author f
 * @date 2022/4/26 23:02
 */
public class Test04 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,8,23,36,645,34634,345345};
        int findNum = 34634;
        int left = 0;
        int right = arr.length - 1;
        int middle = (left + right) / 2;
        while (left <= right) {
            if (arr[middle] == findNum) {
                System.out.println("索引是： " + middle);
                System.exit(0);
            }else if (arr[middle] > findNum) {
                right = middle - 1;
            }else {
                left = middle + 1;
            }
            middle = (left + right) / 2;
        }
        System.out.println("无索引： " + -1);
    }
}
