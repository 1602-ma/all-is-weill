package com.feng.day02;

/**
 * @author f
 * @date 2022/4/24 22:38
 */
public class Test04 {
    public static void main(String[] args) {
        FlyAble f1 = new FlyAble() {

            @Override
            public void fly() {
                System.out.println("比第一次飞得更高");
            }
        };
        f1.fly();
        new FlyAble() {
            @Override
            public void fly() {
                System.out.println("比第二次飞得更高");
            }
        }.fly();
        showFly(new FlyAble() {
            @Override
            public void fly() {
                System.out.println("比第三次飞得更高");
            }
        });
    }

    public static void showFly(FlyAble f) {
        f.fly();
    }
}
