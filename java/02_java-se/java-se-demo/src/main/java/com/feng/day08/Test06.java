package com.feng.day08;

import java.util.concurrent.CountDownLatch;

/**
 * @author f
 * @date 2022/5/4 13:12
 */
public class Test06 {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch cdl = new CountDownLatch(9);
        MyThread1 t1 = new MyThread1(cdl);
        MyThread2 t2 = new MyThread2(cdl);
        t1.start();
        Thread.sleep(1000);
        t2.start();
        Thread.sleep(10000);
    }
}
