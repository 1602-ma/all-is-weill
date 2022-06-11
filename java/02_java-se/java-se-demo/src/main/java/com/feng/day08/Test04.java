package com.feng.day08;

/**
 * @author f
 * @date 2022/5/4 12:42
 */
public class Test04 {
    public static void main(String[] args) throws InterruptedException {
        AtomicThread t = new AtomicThread();
        t.start();
        for (int i = 0; i < 10000; i++) {
            synchronized (t) {
                t.count++;
            }
        }
        Thread.sleep(1000);
        System.out.println("count的最终结果是：" + t.count);
    }
}
