package com.chenlw.springbootredis;


import com.chenlw.springbootredis.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedis {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void clearRedis(){
    }

    @Test
    public void test() throws Exception {
        stringRedisTemplate.opsForValue().set("aaa", "111");
        Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));
        redisTemplate.delete("aaa");
    }

    @Test
    public void testObj() throws Exception {
        User user = new User("aa@126.com", "aa", "aa123456", "aa", "123");
        ValueOperations<String, User> operations = redisTemplate.opsForValue();
        operations.set(user.getUserName(), user);
        // 1秒后清除缓存
        operations.set("chenlw", user, 1, TimeUnit.SECONDS);
        Thread.sleep(1000);
        //redisTemplate.delete("com.neo.f");
        boolean exists = redisTemplate.hasKey(user.getUserName());
        if (exists) {
            System.out.println("exists is true");
        } else {
            System.out.println("exists is false");
        }
        // Assert.assertEquals("aa", operations.get("com.neo.f").getUserName());
    }

    @Test
    public void testUpdateAndGet() throws Exception {
        User user = new User("aa@126.com", "aa", "1234567", "123456", "12345");
        ValueOperations<String, User> operations = redisTemplate.opsForValue();
        operations.set(user.getUserName(), user);
        //redisTemplate.delete("com.neo.f");
        boolean exists = redisTemplate.hasKey(user.getUserName());
        if (exists) {
            System.out.println("exists is true");
        } else {
            System.out.println("exists is false");
        }
//        SetOperations setOperations = redisTemplate.opsForSet();
//        if(setOperations!=null){
//            setOperations.remove(user.getUserName());
//        }

        redisTemplate.delete(user.getUserName());
        if (redisTemplate.hasKey(user.getUserName())) {
            System.out.println("exists is true");
        } else {
            System.out.println("exists is false");
        }
        // Assert.assertEquals("aa", operations.get("com.neo.f").getUserName());
    }
}
