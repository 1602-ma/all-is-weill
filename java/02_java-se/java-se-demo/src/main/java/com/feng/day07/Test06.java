package com.feng.day07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author f
 * @date 2022/4/27 23:02
 */
public class Test06 {
    public static void main(String[] args) throws ParseException {
//        System.out.println(10/0);
        method(10, 0);
        method2(2,3);
    }

    public static void method(int num1, int num2) throws ArithmeticException{
        int num3 = num1 / num2;
    }

    private static void method2(int num1, int num2) throws ParseException {
        String time = "2022-04-01";
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date d = df.parse(time);
    }
}
