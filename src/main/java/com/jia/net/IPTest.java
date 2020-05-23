package com.jia.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * IPTest
 *
 * @author sansan
 * @date 2020/5/21
 */
public class IPTest {

    public static void main(String[] args) throws UnknownHostException {
        //使用getLocalHost方法创建InetAddress对象
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address.getHostAddress());
        //计算机名
        System.out.println(address.getHostName());

        //根据域名得到
        address = InetAddress.getByName("www.baidu.com");
        System.out.println(address.getHostAddress());
        System.out.println(address.getHostName());
    }
}
