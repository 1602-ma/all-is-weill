package com.feng.day09;

/**
 * @author f
 * @date 2022/5/5 22:43
 */
public class Test03 {
    public static void main(String[] args) {
        Object lock = new Object();
        new Thread() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println("停下来。。");
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("结束。。");
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println("唤醒");
                    lock.notify();
                }
            }
        }.start();
    }
}
