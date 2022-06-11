package com.feng.day10;

import java.io.File;
import java.util.Arrays;

/**
 * @author f
 * @date 2022/5/5 23:22
 */
public class Test03 {
    public static void main(String[] args) {
        File f1 = new File("D:\\");
        String[] list = f1.list();
        System.out.println(Arrays.toString(list));
        File[] files = f1.listFiles();
        System.out.println(Arrays.toString(files));
    }
}
