package com.example.redis;

import com.example.redis.redis_template.RedisTemplateTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RedisApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(RedisApplication.class, args);
        RedisTemplateTest redisTest = context.getBean(RedisTemplateTest.class);
        redisTest.typeString();

    }

}
