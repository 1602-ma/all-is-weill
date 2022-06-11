package com.feng.day12;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author f
 * @date 2022/5/8 17:32
 */
public class Test01 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ip1 = InetAddress.getLocalHost();
        System.out.println("ip1" + ip1);

        InetAddress ip2 = InetAddress.getByName("www.baidu.com");
        System.out.println("ip2=" + ip2);
    }
}
