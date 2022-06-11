package com.feng.day10;

import java.io.File;

/**
 * @author f
 * @date 2022/5/6 20:50
 */
public class Test06 {
    public static void main(String[] args) {
        File f1 = new File("D:\\");
        showFile(f1);
    }

    public static void showFile(File file) {
        if (file.isDirectory()) {
            System.out.println("当前操作的目录是： " + file.getAbsolutePath());
            File[] files = file.listFiles();
            for (File file1 : files) {
                if (file1.isDirectory()) {
                    showFile(file1);
                }else if (file1.isFile()) {
                    String name = file1.getName();
                    if (name.endsWith(".java")) {
                        System.out.println(name);
                    }
                }
            }
        }else {
            System.out.println("操作的不是目录，是一个文件");
        }
    }
}
