package com.feng.day08;

/**
 * @author f
 * @date 2022/5/1 18:48
 */
public class StaticMethodThread extends Thread{

    @Override
    public void run() {
        show();
    }

    public static synchronized void show() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在打印" + i);
        }
    }
}
