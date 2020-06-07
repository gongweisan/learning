package com.jia.reflection;

/**
 * 测试 对象的获取方式
 * Demo01
 *
 * @author sansan
 * @date 2020/6/2
 */
@SuppressWarnings("all")
public class Demo01 {

    public static void main(String[] args) {
        String path = "com.jia.reflection.IUser";

        try {
            //一个类只对应一个class对象
            Class clazz = Class.forName(path);
            System.out.println(clazz.hashCode());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
