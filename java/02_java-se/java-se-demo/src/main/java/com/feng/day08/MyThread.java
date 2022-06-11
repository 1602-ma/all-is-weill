package com.feng.day08;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author f
 * @date 2022/5/4 12:56
 */
public class MyThread extends Thread{
    public ConcurrentHashMap<String, Integer> hm = new ConcurrentHashMap<>();

    @Override
    public void run() {
        for (int i = 0; i < 50000; i++) {
            hm.put(getName() + i, i);
        }
        System.out.println("子线程添加5万数据结束");
    }
}
