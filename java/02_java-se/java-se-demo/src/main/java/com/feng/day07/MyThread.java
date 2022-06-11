package com.feng.day07;

/**
 * @author f
 * @date 2022/5/1 18:12
 */
public class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("i= " + i + Thread.currentThread().getName());
        }
    }
}
