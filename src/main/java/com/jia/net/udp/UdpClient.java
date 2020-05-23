package com.jia.net.udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.rmi.server.ExportException;

/**
 * UdpClient
 *
 * @author sansan
 * @date 2020/5/23
 */
public class UdpClient implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(300);
            System.out.println("发送方启动。。。");
            //使用DatagramSocket 指定端口 创建发送端
            DatagramSocket client = new DatagramSocket(8889);
//            String data = "这是一个内容";
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String data = reader.readLine();
            byte[] bytes = data.getBytes();
            //封装成DatagramPacket包裹 需要指定目的地
            DatagramPacket packet = new DatagramPacket(bytes, 0, data.length(), new InetSocketAddress("localhost", 9999));
            client.send(packet);
            client.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
