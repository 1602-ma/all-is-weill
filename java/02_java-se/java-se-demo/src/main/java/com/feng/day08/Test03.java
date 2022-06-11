package com.feng.day08;

/**
 * @author f
 * @date 2022/5/2 13:15
 */
public class Test03 {
    public static void main(String[] args) {


        VolatileThread t = new VolatileThread();
        t.start();

        while (true) {
            if (VolatileThread.flag) {
                System.out.println("我进来了");
                break;
            }
        }

        System.out.println("结束");

    }
}
