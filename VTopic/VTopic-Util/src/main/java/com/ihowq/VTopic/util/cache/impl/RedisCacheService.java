package com.ihowq.VTopic.util.cache.impl;

import com.alibaba.fastjson.JSONObject;
import com.ihowq.VTopic.util.Result;
import com.ihowq.VTopic.util.cache.IRedisCacheService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.RedisSerializer;

import javax.annotation.Resource;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * Redis缓存
 *
 * @author howq
 * @create 2017-03-15 14:17
 **/
public class RedisCacheService implements IRedisCacheService {

    private static final Logger logger = LoggerFactory.getLogger(RedisCacheService.class);
    @Autowired
    private RedisTemplate<String, String> redisTemplate;
    @Resource(
            name = "redisTemplate"
    )
    private ValueOperations<String, String> valueOperations;

    public RedisCacheService() {
    }

    public Result<String> saveByKey(String key, String value) {
        Result result = new Result();

        try {
            String e = (String)this.valueOperations.get(key);
            if(StringUtils.isBlank(e)) {
                this.valueOperations.set(key, value);
            } else {
                result.doErrorHandle("添加失败【" + key + "】已存在");
            }
        } catch (Exception var5) {
            logger.error("redis 添加失败", var5);
            result.doErrorHandle("网络异常请稍后再试");
        }

        return result;
    }

    public Result<String> saveByObject(String key, Object value) {
        Result result = new Result();

        try {
            String e = (String)this.valueOperations.get(key);
            if(StringUtils.isBlank(e)) {
                String objStr = JSONObject.toJSONString(value);
                this.valueOperations.set(key, objStr);
            } else {
                result.doErrorHandle("添加失败【" + key + "】已存在");
            }
        } catch (Exception var6) {
            logger.error("redis 添加失败", var6);
            result.doErrorHandle("网络异常请稍后再试");
        }

        return result;
    }

    public Object getByClass(String key, Class<?> clazz) {
        try {
            String e = (String)this.valueOperations.get(key);
            return StringUtils.isEmpty(e)?null:JSONObject.parseObject(e, clazz);
        } catch (Exception var4) {
            logger.error("获取对象失败!");
            return null;
        }
    }

    public void delByKey(String key) {
        try {
            if(key != null) {
                this.redisTemplate.delete(key);
            }
        } catch (Exception var3) {
            logger.error("缓存删除失败", var3);
        }

    }

    public void batchDeleteByCollection(Collection<String> collections) {
        if(collections != null) {
            this.redisTemplate.delete(collections);
        }

    }

    public Result<String> getByKey(String key) {
        Result result = new Result();

        try {
            if(key != null) {
                String e = (String)this.valueOperations.get(key);
                if(StringUtils.isNotBlank(e)) {
                    result.setData(e);
                } else {
                    result.doErrorHandle("查询结果为空");
                }
            }
        } catch (Exception var4) {
            logger.error("缓存查询异常", var4);
            result.doErrorHandle("网络异常，请稍后再试！");
        }

        return result;
    }

    public Result getByObject(String key) {
        Result result = new Result();

        try {
            String e = (String)this.valueOperations.get(key);
            if(StringUtils.isNotBlank(e)) {
                result.setData(e);
            } else {
                result.doErrorHandle("查询结果为空");
            }
        } catch (Exception var4) {
            logger.error("缓存查询异常", var4);
            result.doErrorHandle("网络异常，请稍后再试！");
        }

        return result;
    }

    public void modifyByKey(String key, String value) {
        try {
            this.valueOperations.set(key, value);
        } catch (Exception var4) {
            logger.error("缓存查询修改", var4);
        }

    }

    public Set<String> getKeys(String keyPattern) {
        Object result = new HashSet();

        try {
            result = this.redisTemplate.keys(keyPattern);
        } catch (Exception var4) {
            logger.error("查询缓存列表失败", var4);
        }

        return (Set)result;
    }

    public Long getIncrementQueueByKey(String key) {
        Long queueNum = this.valueOperations.increment(key, 1L);
        return queueNum;
    }

    public Long decreaseByKey(String key) {
        Long queueNum = this.valueOperations.increment(key, -1L);
        return queueNum;
    }

    public void setExpireTime(String key, Long expireTime) {
        if(expireTime != null) {
            this.redisTemplate.expire(key, expireTime.longValue(), TimeUnit.SECONDS);
        }

    }

    public String getLock(String lockVarious, Long tryTime) {
        try {
            if(tryTime == null) {
                tryTime = Long.valueOf(5L);
            }

            String e = UUID.randomUUID().toString();
            long now = 0L;
            long endTime = now + tryTime.longValue();

            while(now < endTime) {
                if(this.valueOperations.setIfAbsent(lockVarious, e).booleanValue()) {
                    this.redisTemplate.expire(lockVarious, 30L, TimeUnit.SECONDS);
                    return e;
                }

                ++now;
                Thread.sleep(100L);
            }
        } catch (Exception var8) {
            var8.printStackTrace();
        }

        return null;
    }

    public Boolean releaseLock(String lockName, String identifier) {
        if(lockName != null && identifier != null) {
            final byte[] rawKey = lockName.getBytes();
            Boolean result = Boolean.valueOf(false);
            String lockIdentifier = (String)this.redisTemplate.boundValueOps(lockName).get();
            if(StringUtils.isNotBlank(identifier) && identifier.equals(lockIdentifier)) {
                try {
                    this.redisTemplate.execute(new RedisCallback() {
                        public Object doInRedis(RedisConnection connection) throws DataAccessException {
                            connection.watch(new byte[][]{rawKey});
                            connection.multi();
                            connection.del(new byte[][]{rawKey});
                            List objects = connection.exec();
                            connection.unwatch();
                            return objects;
                        }
                    });
                    result = Boolean.valueOf(true);
                } catch (Exception var7) {
                    result = Boolean.valueOf(false);
                }
            }

            return result;
        } else {
            return Boolean.valueOf(false);
        }
    }

    public Result<String> saveByObject(String key, Object value, int expireTime) {
        Result result = new Result();

        try {
            this.valueOperations.set(key, JSONObject.toJSONString(value), (long)expireTime, TimeUnit.SECONDS);
        } catch (Exception var6) {
            logger.error("redis 添加失败", var6);
            result.doErrorHandle("网络异常请稍后再试");
        }

        return result;
    }

    public Result<String> saveByObject(String key, Object value, int expireTime, TimeUnit timeUnit) {
        Result result = new Result();

        try {
            this.valueOperations.set(key, JSONObject.toJSONString(value), (long)expireTime, timeUnit);
        } catch (Exception var7) {
            logger.error("redis 添加失败", var7);
            result.doErrorHandle("网络异常请稍后再试");
        }

        return result;
    }

    public void setex(String key, int timeout, String value) {
        RedisConnection connection = null;

        try {
            if(key != null) {
                connection = this.redisTemplate.getConnectionFactory().getConnection();
                connection.setEx(key.getBytes(), (long)timeout, value.getBytes());
            }
        } finally {
            if(connection != null) {
                connection.close();
            }

        }

    }

    public boolean exists(String key) {
        RedisConnection connection = null;
        if(key == null) {
            return false;
        } else {
            Boolean result;
            try {
                connection = this.redisTemplate.getConnectionFactory().getConnection();
                result = connection.exists(key.getBytes());
            } finally {
                if(connection != null) {
                    connection.close();
                }

            }

            return result.booleanValue();
        }
    }

    public void rpush(String key, String val) {
        RedisConnection connection = null;
        if(!StringUtils.isEmpty(key)) {
            try {
                connection = this.redisTemplate.getConnectionFactory().getConnection();
                RedisSerializer serializer = this.redisTemplate.getStringSerializer();
                byte[] keys = serializer.serialize(key.toString());
                byte[] name = serializer.serialize(val.toString());
                connection.sAdd(keys, new byte[][]{name});
            } finally {
                if(connection != null) {
                    connection.close();
                }

            }

        }
    }

    public int lrang(String key) {
        RedisConnection connection = null;
        if(StringUtils.isEmpty(key)) {
            return 0;
        } else {
            int var6;
            try {
                connection = this.redisTemplate.getConnectionFactory().getConnection();
                RedisSerializer serializer = this.redisTemplate.getStringSerializer();
                byte[] keys = serializer.serialize(key.toString());
                Set sMembers = connection.sMembers(keys);
                if(null == sMembers) {
                    return 0;
                }

                var6 = sMembers.size();
            } finally {
                if(connection != null) {
                    connection.close();
                }

            }

            return var6;
        }
    }

    public void ltrim(String key) {
        RedisConnection connection = null;
        if(!StringUtils.isEmpty(key)) {
            try {
                connection = this.redisTemplate.getConnectionFactory().getConnection();
                RedisSerializer serializer = this.redisTemplate.getStringSerializer();
                byte[] keys = serializer.serialize(key.toString());
                Set sMembers = connection.sMembers(keys);
                Iterator i$ = sMembers.iterator();

                while(i$.hasNext()) {
                    byte[] ss = (byte[])i$.next();
                    connection.sRem(keys, new byte[][]{ss});
                }
            } finally {
                if(connection != null) {
                    connection.close();
                }

            }

        }
    }
}
