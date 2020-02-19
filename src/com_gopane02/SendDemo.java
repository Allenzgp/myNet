package com_gopane02;

import java.io.IOException;
import java.net.*;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        //创建DatagramSocket()构造数据报套按字节并将其绑定在本地主机的任何可用端口
        DatagramSocket ds = new DatagramSocket();

        //创建数据，并将其数据打包
        //DatagramPacket​(byte[] buf, int length, InetAddress address, int port) 构造
        //一个数据包，发送长度为 length的数据包到指定主机上的指定端口号。
        byte[] bys = "Hello,i am coming.".getBytes();
        /*int length = bys.length;
        InetAddress address = InetAddress.getByName("169.254.90.4");
        int port = 10086;
        DatagramPacket dp = new DatagramPacket(bys,length,address,port);*/

        DatagramPacket dp = new DatagramPacket(bys,bys.length, InetAddress.getByName("169.254.90.4"),10086);

        //调用DatagramSocket对象的方法发送数据
        //void send(DatagramPacket p)从此套接字发送数据包
        ds.send(dp);

        //关闭发送端
        //void close() 关闭此数据报套接字
        ds.close();
    }
}
