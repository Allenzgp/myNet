package com_gopane08;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
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

        //释放资源
        bw.close();
        s.close();
    }
}
