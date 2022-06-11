package com.feng.day09;

/**
 * @author f
 * @date 2022/5/5 22:41
 */
public class Test02 {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        synchronized (lock) {
            System.out.println("停下来。。");
            lock.wait();
        }
        System.out.println("结束");
    }
}
