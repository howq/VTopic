package com.ihowq.VTopic.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

/**
 * Created by howq on 2017/3/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value={"classpath*:spring/applicationContext-redis.xml"})
public class RedisTest {

    @Autowired
    private ShardedJedisPool shardedJedisPool;

    @Test
    public void testSet() {
        ShardedJedis jedis = shardedJedisPool.getResource();
        jedis.set("name", "nnnn");
    }

    @Test
    public void testGet() {
        ShardedJedis jedis = shardedJedisPool.getResource();
        String name = jedis.get("name");
        System.out.println(name);
    }

}


