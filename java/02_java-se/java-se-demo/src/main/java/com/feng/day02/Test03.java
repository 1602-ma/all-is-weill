package com.feng.day02;

/**
 * @author f
 * @date 2022/4/24 22:27
 */
public class Test03 {
    public static void main(String[] args) {
        Person p = new Person();
//        Person.Heart heart = new Person.Heart();
        Person.Heart ph = p.new Heart();
        ph.jump();
        p.setIsLive(false);
        ph.jump();
    }
}
