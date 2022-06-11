package com.feng.day07;

/**
 * @author f
 * @date 2022/5/1 18:17
 */
public class MyRunable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
