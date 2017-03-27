package com.ihowq.VTopic.cache;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

/**
 * Created by howq on 2017/3/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value={"classpath:spring/applicationContext-redis-test.xml"})
public class RedisTest {

    private Logger logger = LoggerFactory.getLogger(getClass());

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
        logger.info(name);
    }

}


