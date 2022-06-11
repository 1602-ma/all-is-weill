package com.feng.day07;

import javax.lang.model.element.VariableElement;

/**
 * @author f
 * @date 2022/5/1 18:24
 */
public class Test10 {
    public static void main(String[] args) throws InterruptedException {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "i=" + i);

                }
            }
        };
//        Thread t = new Thread(r, "bo");
        new Thread(new Runnable() {
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
        }, "good").start();

        for (int j = 0; j < 100; j++) {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + "j = " + j);
        }
    }
}
