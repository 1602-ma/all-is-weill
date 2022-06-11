package com.feng.day08;

/**
 * @author f
 * @date 2022/5/4 12:41
 */
public class AtomicThread extends Thread{
    public volatile int count;

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            synchronized (this) {
                count++;
            }

        }
        System.out.println("子线程添加完成");
    }
}
