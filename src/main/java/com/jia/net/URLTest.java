package com.jia.net;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * URL:统一资源定位器
 * 1 协议
 * 2 域名 计算机
 * 3 端口 默认80
 * 4 请求资源
 * URLTest
 *
 * @author sansan
 * @date 2020/5/21
 */
public class URLTest {

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://blog.csdn.net/weixin_40797576/article/details/79288730?id=3#A");
        System.out.println("协议："+url.getProtocol());
        System.out.println("域名ip："+url.getHost());
        System.out.println("端口："+url.getPort());
        System.out.println("请求资源1："+url.getFile());
        System.out.println("请求资源2："+url.getPath());
        System.out.println("参数："+url.getQuery());
        System.out.println("锚点："+url.getRef());
    }
}
