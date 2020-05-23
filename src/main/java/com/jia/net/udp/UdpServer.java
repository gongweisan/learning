package com.jia.net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * UdpServe
 *
 * @author sansan
 * @date 2020/5/23
 */
public class UdpServer implements Runnable {


    @Override
    public void run() {
        System.out.println("接收方启动中。。。");
        DatagramSocket server = null;
        try {
            server = new DatagramSocket(9999);
        } catch (SocketException e) {
            e.printStackTrace();
        }
        byte[] container = new byte[1024 * 60];
        DatagramPacket datagramPacket = new DatagramPacket(container, 0, container.length);
        //阻塞式接收包裹
        try {
            server.receive(datagramPacket);
            byte[] datas = datagramPacket.getData();
            String a = new String(datas, 0, datagramPacket.getLength());
            System.out.println(a);

        } catch (IOException e) {
            e.printStackTrace();
        }
        server.close();
    }
}
