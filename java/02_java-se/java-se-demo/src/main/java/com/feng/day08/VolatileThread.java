package com.feng.day08;

/**
 * @author f
 * @date 2022/5/2 13:14
 */
public class VolatileThread extends Thread{
    public static volatile boolean flag = false;

    @Override
    public void run() {
        System.out.println("子线程启动");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = true;
        System.out.println("flag的值已被修改");
    }
}
