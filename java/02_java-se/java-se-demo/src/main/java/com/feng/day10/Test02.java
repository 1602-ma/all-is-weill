package com.feng.day10;

import java.io.File;
import java.io.IOException;

/**
 * @author f
 * @date 2022/5/5 23:18
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("a\\a.txt");
        System.out.println(f1.mkdirs());
    }
}
