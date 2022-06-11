package com.feng.day08;

import java.util.concurrent.CountDownLatch;

/**
 * @author f
 * @date 2022/5/4 13:11
 */
public class MyThread2 extends Thread{
    public CountDownLatch cdl;

    public MyThread2(CountDownLatch cdl) {
        this.cdl = cdl;
    }

    @Override
    public void run() {
        System.out.println("线程2打印B");
        cdl.countDown();
    }
}
