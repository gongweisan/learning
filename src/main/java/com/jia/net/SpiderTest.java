package com.jia.net;

import org.apache.tomcat.jni.OS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 网络爬虫原理 + 模拟浏览器
 * SpiderTest
 *
 * @author sansan
 * @date 2020/5/21
 */
public class SpiderTest {

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.baidu.com");
        InputStream is = url.openStream();
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.4044.138 Safari/537.36");
        //下载资源
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
        String msg = null;
        while (null != (msg = br.readLine())) {
            System.out.println(msg);
        }
        br.close();
    }
}
