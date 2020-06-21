package com;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SanApplication
 * 启动类
 * @author sansan
 * @date 2020/6/16
 * 开启基于注解的RabbitMQ模式
 */
@EnableRabbit
@SpringBootApplication
@Slf4j
public class SanApplication {

    public static void main(String[] args) {
        SpringApplication.run(SanApplication.class,args);
        log.info("run");
    }
}
