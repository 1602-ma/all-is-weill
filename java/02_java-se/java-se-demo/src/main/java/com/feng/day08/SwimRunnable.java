package com.feng.day08;

/**
 * @author f
 * @date 2022/5/4 23:33
 */
public class SwimRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("请求分配教练");
        System.out.println("分配了" + Thread.currentThread().getName() + "教练");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "教完了 等待下一个学员");
    }
}
