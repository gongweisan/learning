package com.jia.y;

import com.jia.amqp.bean.book.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Autowired
    private AmqpAdmin amqpAdmin;

    @Test
    public void createExChange() {
    /*	amqpAdmin.declareExchange(new DirectExchange("amqpadmin.exchange"));
		System.out.println("创建exchange成功");*/
//        amqpAdmin.declareQueue(new Queue("amqpadmin.queue", true));
        //创建绑定规则
        amqpAdmin.declareBinding(new Binding("amqpadmin.queue",
                Binding.DestinationType.QUEUE,"amqpadmin.exchange","amqpadmin.ha",null));
    }

    @Test
    public void contextLoads() {
    }

    @Test
    public void testRedis() {
        String a = String.valueOf(redisTemplate.opsForValue().get("a"));
        System.out.println(a);
    }

    @Test
    public void testrabbit() {
        Map map = new HashMap();
        map.put("code", "这是单播");
        map.put("data", Arrays.asList("数据", true, 1234));
        rabbitTemplate.convertAndSend("exchanges.direct", "atguigu", map);
    }

    @Test
    public void testrabbit2() {
        rabbitTemplate.convertAndSend("exchanges.fanout", "", new Book("三三", "新是传奇"));
    }

    @Test
    public void receive() {
        Object o = rabbitTemplate.receiveAndConvert("atguigu");
        System.out.println(o.getClass());
        System.out.println(o);
    }

}
