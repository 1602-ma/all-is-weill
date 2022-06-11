package com.feng.day08;

/**
 * @author f
 * @date 2022/5/1 18:49
 */
public class Test02 {
    public static void main(String[] args) throws InterruptedException {
        StaticMethodThread st = new StaticMethodThread();
        st.setName("静态方法锁");
        st.start();

        synchronized (StaticMethodThread.class) {
            for (int i = 0; i < 100; i++) {
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName() + "正在打印" + i);
            }
        }
    }
}
