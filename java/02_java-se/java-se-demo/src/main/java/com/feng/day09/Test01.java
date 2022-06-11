package com.feng.day09;

/**
 * @author f
 * @date 2022/5/5 22:38
 */
public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            System.out.println("睡一秒");
            Thread.sleep(1000);
        }
    }
}
