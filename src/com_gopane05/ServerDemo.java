package com_gopane05;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务端的对象ServerSocket
        ServerSocket ss = new ServerSocket(10001);

        //监听客户端连接，返回一个Socket对象
        Socket s = ss.accept();

        //获取输入流，读数据，并把数据显示在控制台上。
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys, 0, len);
        System.out.println("服务器"+data);

        //给出反馈
        OutputStream os = s.getOutputStream();
        os.write("数据已收到。".getBytes());

        //释放资源
        //s.close();
        ss.close();

    }
}
