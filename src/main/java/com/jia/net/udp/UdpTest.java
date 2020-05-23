package com.jia.net.udp;


import com.jia.net.udp.talk.TalkSend;
import com.jia.net.udp.talk.TalkStudent;
import com.jia.net.udp.talk.TalkTeacher;

/**
 * UdpTest
 *
 * @author sansan
 * @date 2020/5/23
 */
public class UdpTest {

    public static void main(String[] args) {
//        new Thread(new UdpClient()).start();
//        new Thread(new UdpServer()).start();
        TalkTeacher.teacher();
        TalkStudent.student();
    }
}
