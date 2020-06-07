package com.jia.pattern.singlet;

/**
 * 单例模式 饿汉
 * SingletonDemo1
 *
 * @author sansan
 * @date 2020/6/7
 */
public class SingletonDemo1 {

    private static SingletonDemo1 instance = new SingletonDemo1();

    private SingletonDemo1() {
    }

    public static SingletonDemo1 getInstance(){
        return instance;
    }
}
