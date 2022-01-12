package com.example.redis.redis_template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.*;
import org.springframework.stereotype.Component;

import java.time.Duration;

/**
 * @author ly243199
 * @date 2022/1/11
 * @description
 */
@Component
public class RedisTemplateTest {

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * String类型简单操作
     */
    public void typeString(){
        ValueOperations operations = redisTemplate.opsForValue();
        operations.set("hello","hello redisTemplate");
        operations.set("hello 01","hello redisTemplate", Duration.ofMillis(20));

    }

    public void typeList(){
        ListOperations operations = redisTemplate.opsForList();


    }
    public void typeHash(){
        HashOperations operations = redisTemplate.opsForHash();


    }
    public void typeSet(){
        SetOperations operations = redisTemplate.opsForSet();

    }
    public void typeSortedSet(){
        ZSetOperations operations = redisTemplate.opsForZSet();
        

    }
}
