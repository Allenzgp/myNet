package com_gopane03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //创建接收端的Socket对象()
        DatagramSocket ds = new DatagramSocket(12345);

        while(true) {//死循环接收
            //创建数据包，接收数据
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys, bys.length);

            //接收数据
            ds.receive(dp);

            //解析数据
            System.out.println("数据是：" + new String(dp.getData(), 0, dp.getLength()));
        }
        //关闭接收端，不用关了，一直接数据
        //ds.close();
    }
}
