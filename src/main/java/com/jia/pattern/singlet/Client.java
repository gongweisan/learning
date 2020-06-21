package com.jia.pattern.singlet;

import java.util.concurrent.CountDownLatch;

/**
 * 使用同步辅助类 测试单例模式的效率
 * Client
 *
 * @author sansan
 * @date 2020/6/8
 */
public class Client {

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        int num = 10;
        final CountDownLatch countDownLatch = new CountDownLatch(num);
        for (int i = 0; i < num; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i1 = 0; i1 < 1000000; i1++) {
                        Object o = SingletonDemo1.getInstance();
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }
        countDownLatch.await();
        long end = System.currentTimeMillis();
        System.out.println("time"+(end-start));
    }

}
