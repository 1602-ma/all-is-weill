package com.feng.day08;

/**
 * @author f
 * @date 2022/5/4 12:58
 */
public class Test05 {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();

        for (int i = 0; i < 50000; i++) {
            t.hm.put(Thread.currentThread().getName() + i, i);
        }
        Thread.sleep(1000);
        System.out.println("集合中最终存储了" + t.hm.size() + "个数据");
    }
}
