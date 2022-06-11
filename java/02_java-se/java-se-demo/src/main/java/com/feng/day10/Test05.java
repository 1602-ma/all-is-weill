package com.feng.day10;

/**
 * @author f
 * @date 2022/5/6 20:46
 */
public class Test05 {
    public static void main(String[] args) {
        int sum = getSum(33);
        System.out.println(sum);
    }

    public static int getSum(int num) {
        if (num == 1) {
            return 1;
        }
        return num + getSum(num - 1);
    }
}
