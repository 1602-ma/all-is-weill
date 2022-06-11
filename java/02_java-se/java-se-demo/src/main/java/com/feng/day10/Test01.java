package com.feng.day10;

import java.io.File;

/**
 * @author f
 * @date 2022/5/5 23:07
 */
public class Test01 {
    public static void main(String[] args) {
        File f1 = new File("D:\\test");
        System.out.println(f1);
        String path = "a.txt";
        File f2 = new File(path);
        System.out.println(f2.getAbsolutePath());
    }
}
