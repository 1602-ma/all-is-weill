package com.feng.day11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @author f
 * @date 2022/5/8 17:14
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        Properties pro = new Properties();
        pro.load(new FileInputStream("a.txt"));

        Set<String> key = pro.stringPropertyNames();
        for (String s : key) {
            String value = pro.getProperty(s);
            System.out.println(key + "=" + value);
        }
    }
}
