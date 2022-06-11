package com.feng.day11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author f
 * @date 2022/5/8 17:07
 */
public class Test01 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("day\\a.txt");
             FileInputStream fis = new FileInputStream("a\\a.txt");
        ) {
            byte[] bys = new byte[9182];
            int len;
            while ((len = fis.read(bys)) != -1) {
                fos.write(bys, 0, len);
            }
        }catch (IOException e) {
            System.out.println("流异常");
        }

    }
}
