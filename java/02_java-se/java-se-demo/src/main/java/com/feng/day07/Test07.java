package com.feng.day07;

/**
 * @author f
 * @date 2022/5/1 11:57
 */
public class Test07 {
    public static void main(String[] args) {
        System.out.println("开始：");
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println("jjjjj");
            e.printStackTrace();
        }
        System.out.println("结束：");
    }

    private static void method1() {

    }
}
