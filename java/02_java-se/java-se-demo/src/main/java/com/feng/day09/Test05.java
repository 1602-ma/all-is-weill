package com.feng.day09;

import java.util.ArrayList;

/**
 * @author f
 * @date 2022/5/5 22:56
 */
public class Test05 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        list.add("孙七");
        list.add("周八");
        list.add("张三丰");
        list.stream().filter((String name) -> {
            return name.startsWith("张");
        }).filter((String name) -> {
            return name.length() == 3;
        }).forEach((String name) -> {
            System.out.println(name);
        });
    }
}
