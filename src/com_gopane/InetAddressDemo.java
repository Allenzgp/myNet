package com_gopane;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        //static InetAddress getByName​(String host) 确定主机名称的IP地址。
        //InetAddress address = InetAddress.getByName("gopanes");
        InetAddress address = InetAddress.getByName("169.254.90.4");

        //String getHostName​() 获取此IP地址的主机名。
        String name = address.getHostName();

        //String getHostAddress​() 返回文本显示中的IP地址字符串。
        String ip = address.getHostAddress();

        System.out.println("主机名：" + name);
        System.out.println("ip地址：" + ip);
    }
}
