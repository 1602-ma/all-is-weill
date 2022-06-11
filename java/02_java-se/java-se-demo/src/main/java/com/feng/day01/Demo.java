package com.feng.day01;

/**
 * @author f
 * @date 2022/4/20 23:26
 */
public class Demo {
    public int num = 99;

    public Demo() {
        this(88);
        System.out.println("无参构造方法");
    }

    public Demo(int num) {
        System.out.println("有参构造方法");
        this.num = num;
    }

    public void show() {
        int num = 10;
        System.out.println("局部变量" + num);
        System.out.println("成员变量" + this.num);
        this.method();
    }

    public void method() {
        System.out.println("method方法");
    }
}
