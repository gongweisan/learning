package com.jia.y;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.entity.ContentType;
import org.apache.http.nio.entity.NStringEntity;
import org.apache.http.util.EntityUtils;
import org.elasticsearch.client.Request;
import org.elasticsearch.client.Response;
import org.elasticsearch.client.ResponseException;
import org.elasticsearch.client.RestClient;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/**
 * EsTests
 *
 * @author sansan
 * @date 2020/6/23
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class EsTests {

    public final RestClient restClient = RestClient
            .builder(new HttpHost("127.0.0.1", 9200, "http"))
            .build();

//    @Ignore
    @Test
    public void search() throws IOException {
        Map<String, String> params = Collections.emptyMap();
        String queryString = "";
        HttpEntity entity = new NStringEntity(queryString, ContentType.APPLICATION_JSON);
        try {
            Request request = new Request("GET", "/megacorp/_search");
            Response response = restClient.performRequest(request);
            System.out.println(response.getStatusLine().getStatusCode());
            String responseBody = null;

            responseBody = EntityUtils.toString(response.getEntity());
            System.out.println("******************************************** ");
            JSONObject jsonObject = JSON.parseObject(responseBody);
            System.out.println(jsonObject.get("hits"));
        }catch (ResponseException e){
            e.printStackTrace();
        }
        System.out.println("23333");
    }

}
