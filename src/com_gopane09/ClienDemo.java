package com_gopane09;

import java.io.*;
import java.net.Socket;

public class ClienDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端对象
        Socket s = new Socket("169.254.90.4", 10001);

        //封装文本文件数据
        BufferedReader br = new BufferedReader(new FileReader("InetAddressDemo.java"));
        //封装输出流数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while((line = br.readLine())!=null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

//        //自定义结束标记
//        bw.write("886");
//        bw.newLine();
//        bw.flush();

        // shutdownOutput​() 禁用此套接字的输出流。
        s.shutdownOutput();

        //接收反馈
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data = bufferedReader.readLine();//等待读取数据
        System.out.println("服务器的反馈："+data);

        //释放资源
        bw.close();
        s.close();
    }
}
