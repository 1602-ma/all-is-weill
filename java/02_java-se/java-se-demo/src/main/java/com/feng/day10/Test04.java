package com.feng.day10;

/**
 * @author f
 * @date 2022/5/6 20:42
 */
public class Test04 {
    public static void main(String[] args) {
        method(1000);
    }

    public static void method(int num) {
        System.out.println("第" + num + "次执行");
        if (num == 0) {
            return;
        }
        num--;
        method(num);
    }
}
