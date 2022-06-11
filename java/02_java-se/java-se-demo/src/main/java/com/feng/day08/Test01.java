package com.feng.day08;

/**
 * @author f
 * @date 2022/5/1 18:37
 */
public class Test01 {
    public static void main(String[] args) {
        TicketRunnable tr = new TicketRunnable();
        Thread t1 = new Thread(tr, "窗口1");
        Thread t2 = new Thread(tr, "窗口2");
        Thread t3 = new Thread(tr, "窗口3");
        Thread t4 = new Thread(tr, "窗口4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
