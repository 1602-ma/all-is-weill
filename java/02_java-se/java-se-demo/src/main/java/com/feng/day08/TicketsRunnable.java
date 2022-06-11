package com.feng.day08;

/**
 * @author f
 * @date 2022/5/1 18:35
 */
public class TicketsRunnable implements Runnable{
    public int ticket = 100;
    public Object lock = new Object();

    @Override
    public void run() {
        while (true) {
            try {
                sellTicket();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void sellTicket() throws InterruptedException {
        Thread.sleep(100);
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "正在卖出" + ticket + "张票");
            ticket--;
        }
    }
}
