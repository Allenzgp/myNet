package com_gopane06;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket
        Socket s = new Socket("169.254.90.4", 10001);

        //数据来自于键盘录入，直到输入的是数据886，发送数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //封装输出流对象
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while((line = br.readLine())!=null){
            if("886".equals(line)){
                break;
            }

            //获取输出流，写数据
//            OutputStream os = s.getOutputStream();
//            os.write(line.getBytes());
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //释放资源
        s.close();

    }
}
