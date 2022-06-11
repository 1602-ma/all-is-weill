package com.feng.day05;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author f
 * @date 2022/4/25 22:08
 */
public class Test02 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("a");
        c.add("b");
        c.add("c");
        for (String s : c) {
            System.out.println(s);
//            c.add("d");
        }
    }
}
