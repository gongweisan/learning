package com.jia.net;

import java.net.InetSocketAddress;

/**
 * 端口
 * 1 区分软件
 * 2 2个字节 0-65535 UDP TCP
 * PortTest
 *
 * @author sansan
 * @date 2020/5/21
 */
public class PortTest {

    public static void main(String[] args) {
        InetSocketAddress socketAddress = new InetSocketAddress("127.0.0.1",8080);
        InetSocketAddress socketAddress2 = new InetSocketAddress("localhost",9000);
        System.out.println(socketAddress.getHostName());
        System.out.println(socketAddress.getAddress());
        System.out.println(socketAddress2.getAddress());
        System.out.println(socketAddress.getPort());

    }
}
