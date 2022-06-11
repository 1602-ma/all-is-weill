package com.feng.day07;

/**
 * @author f
 * @date 2022/5/1 18:13
 */
public class Test08 {
    public static void main(String[] args) throws InterruptedException {
        MyThread mt = new MyThread("gogo");
        mt.start();

        for (int i = 0; i < 100; i++) {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + "i::::::::::" + i);
        }
    }
}
