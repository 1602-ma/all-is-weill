package com.feng.day09;

/**
 * @author f
 * @date 2022/5/5 22:48
 */
public class Test04 {
    public static void main(String[] args) {
        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "第" + i + "次运行");
            }
        }, "线程4");
        t4.start();
    }
}
