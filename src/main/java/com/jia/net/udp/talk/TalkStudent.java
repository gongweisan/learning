package com.jia.net.udp.talk;

/**
 * 多线程 实现双向交流
 * TalkStudent
 *
 * @author sansan
 * @date 2020/5/23
 */
public class TalkStudent {


    public static void main(String[] args) {
        student();
    }

    public static void student() {
        new Thread(new TalkSend(7777, "localhost", 9999)).start();
        new Thread(new TalkReceive(8888, "学生")).start();
    }
}
