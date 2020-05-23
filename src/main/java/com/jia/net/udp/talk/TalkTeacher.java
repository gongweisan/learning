package com.jia.net.udp.talk;

/**
 * TalkTeacher
 *
 * @author sansan
 * @date 2020/5/23
 */
public class TalkTeacher {

    public static void main(String[] args) {
        teacher();
    }

    public static void teacher() {
        //接收
        new Thread(new TalkReceive(9999, "老师")).start();
        new Thread(new TalkSend(5555, "localhost", 8888)).start();
    }
}
