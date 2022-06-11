package com.feng.day07;

/**
 * @author f
 * @date 2022/5/1 18:19
 */
public class Test09 {
    public static void main(String[] args) throws InterruptedException {
        MyRunable mt = new MyRunable();
        Thread t = new Thread(mt, "jj");
        t.start();

        for (int j = 0; j < 100; j++) {
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName() + "j=" + j);
        }
    }
}
