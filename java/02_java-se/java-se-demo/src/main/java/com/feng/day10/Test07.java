package com.feng.day10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author f
 * @date 2022/5/6 23:12
 */
public class Test07 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("a\\test.txt");
        FileOutputStream fos1 = new FileOutputStream(f1);
        byte[] bys3 = "\r\n".getBytes();
        fos1.write(97);
        byte[] bys = {97, 98 , 99};
        fos1.write(bys);
        fos1.write(bys3);
        byte[] bys2 = {99,100,101};
        fos1.write(bys2, 0, 2);
        fos1.close();
    }
}
