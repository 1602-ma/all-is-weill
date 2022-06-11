package com.feng.day02;

/**
 * @author f
 * @date 2022/4/24 22:22
 */
public class Person {
    private boolean isLive = true;

    public boolean getIsLive() {
        return isLive;
    }

    public void setIsLive(boolean isLive) {
        this.isLive = isLive;
    }

    class Heart {
        public void jump() {
            if (isLive) {
                System.out.println("心脏在跳动");
            }else {
                System.out.println("心脏不动了");
            }
        }
    }
}
