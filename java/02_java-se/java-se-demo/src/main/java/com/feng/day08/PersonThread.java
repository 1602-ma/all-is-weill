package com.feng.day08;

import java.util.concurrent.CyclicBarrier;

/**
 * @author f
 * @date 2022/5/4 23:24
 */
public class PersonThread extends Thread{
    public String name;
    public CyclicBarrier cb;

    public PersonThread(String name, CyclicBarrier cb) {
        this.name = name;
        this.cb = cb;
    }

    @Override
    public void run() {
        System.out.println("到会议室了，等待开会");
        try {
            cb.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
