package com.feng.day08;

import java.util.concurrent.CountDownLatch;

/**
 * @author f
 * @date 2022/5/4 13:09
 */
public class MyThread1 extends Thread{
    public CountDownLatch cdl;

    public MyThread1(CountDownLatch cdl) {
        this.cdl = cdl;
    }

    @Override
    public void run() {
        System.out.println("线程1打印A");
        try {
            cdl.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程1打印C");
    }
}
