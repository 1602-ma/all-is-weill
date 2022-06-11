package com.feng.day02;

/**
 * @author f
 * @date 2022/4/23 21:58
 */
public class Test01 {
    public static void main(String[] args) {
        People p = new People("张三", 128);
        p.country = "中国";
        System.out.println(p.name + p.age + p.country);

        People p2 = new People();
        System.out.println(p2.name + p2.age + p2.country);

        p2.country = "小欧";

        System.out.println(p.country);
        System.out.println(p2.country);
    }
}
