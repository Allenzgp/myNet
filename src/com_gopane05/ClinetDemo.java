package com_gopane05;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClinetDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket
        Socket s = new Socket("169.254.90.4", 10001);

        //获取输出流，写数据
        OutputStream os = s.getOutputStream();
        os.write("hello,i am coming.".getBytes());

        //接受数据反馈
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys,0,len);
        System.out.println("客户端："+data);

        //释放资源
        //is.close();
        //os.close();
        s.close();
    }
}
