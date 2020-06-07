package com.jia.pattern.singlet;

/**
 * 单例模式 懒汉
 * SingletonDemo2
 *
 * @author sansan
 * @date 2020/6/7
 */
public class SingletonDemo2 {

    private static SingletonDemo2 instance;

    private SingletonDemo2() {
    }

    public static synchronized SingletonDemo2 getInstance() {
        if (instance == null) {
            return new SingletonDemo2();
        }
        return instance;
    }
}
