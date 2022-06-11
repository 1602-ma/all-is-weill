package com.feng.day02;

import com.feng.day01.Test;

/**
 * @author f
 * @date 2022/4/23 22:09
 */
public class Test02 {
    static {
        System.out.println("静态代码块");
    }

    public Test02() {
        System.out.println("无参构造方法");
    }

    public static void main(String[] args) {
        System.out.println("main方法");
        new Test02();
        new Test02();
    }
}
