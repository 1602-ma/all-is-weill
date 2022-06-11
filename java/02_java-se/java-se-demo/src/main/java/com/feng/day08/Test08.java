package com.feng.day08;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author f
 * @date 2022/5/4 23:35
 */
public class Test08 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);
        SwimRunnable sr = new SwimRunnable();
        for (int i = 0; i < 10; i++) {
            es.submit(sr);
        }
    }
}
