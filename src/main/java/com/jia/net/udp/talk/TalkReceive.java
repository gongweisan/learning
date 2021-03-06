package com.jia.net.udp.talk;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * 接收端
 * TalkReceive
 *
 * @author sansan
 * @date 2020/5/23
 */
public class TalkReceive implements Runnable {
    private DatagramSocket server;
    private String from;

    public TalkReceive(int port, String from) {
        this.from = from;
        try {
            server = new DatagramSocket(port);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true) {
            byte[] container = new byte[1024 * 60];
            DatagramPacket packet = new DatagramPacket(container, 0, container.length);
            try {
                server.receive(packet);
                byte[] datas = packet.getData();
                int len = packet.getLength();
                String data = new String(datas, 0, len);
                System.out.println(from + "from--" + data);
                if (data.equals("bb")) {
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        server.close();
    }

}
