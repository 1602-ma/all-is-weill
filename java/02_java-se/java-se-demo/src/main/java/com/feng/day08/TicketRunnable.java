package com.feng.day08;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author f
 * @date 2022/5/1 18:57
 */
public class TicketRunnable implements Runnable{
    public int tickket = 100;
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock.lock();
            if (tickket > 0) {
                System.out.println(Thread.currentThread().getName() + "正在卖出第" + tickket + "张票");
                tickket--;
            }
            lock.unlock();
        }
    }
}
