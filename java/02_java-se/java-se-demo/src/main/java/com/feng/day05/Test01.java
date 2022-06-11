package com.feng.day05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author f
 * @date 2022/4/25 22:03
 */
public class Test01 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("a");
        c.add("b");
        c.add("c");
        Iterator<String> iterator = c.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            c.add("d");
        }
    }
}
