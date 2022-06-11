package com.feng.day12;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author f
 * @date 2022/5/8 17:36
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 11);
        OutputStream os = socket.getOutputStream();
        os.write("你好呀".getBytes());
        socket.close();
    }
}
