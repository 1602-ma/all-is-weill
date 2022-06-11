package com.feng.day01;

/**
 * @author f
 * @date 2022/4/20 20:52
 */
public class Fu {
    private int num = 99;
    public int num2 = 11;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void show() {
        System.out.println("Fu show");
    }

    public Fu() {
        System.out.println("父类构造方法--");
    }
}
