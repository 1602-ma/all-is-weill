package com.feng.day08;

import java.util.concurrent.CyclicBarrier;

/**
 * @author f
 * @date 2022/5/4 23:26
 */
public class Test07 {
    public static void main(String[] args) {
        MeetingRunnable mt = new MeetingRunnable();
        CyclicBarrier cb = new CyclicBarrier(5, mt);
        PersonThread t1 = new PersonThread("张三", cb);
        PersonThread t5 = new PersonThread("里斯", cb);
        PersonThread t2 = new PersonThread("王五", cb);
        PersonThread t3 = new PersonThread("赵六", cb);
        PersonThread t4 = new PersonThread("孙琪", cb);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
