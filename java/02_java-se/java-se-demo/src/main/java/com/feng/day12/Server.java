package com.feng.day12;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author f
 * @date 2022/5/8 17:38
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(11);
        Socket socket = ss.accept();
        InputStream is = socket.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        System.out.println("服务器接收到的数据：" + new String(bys, 0, len));
        ss.close();
    }
}
