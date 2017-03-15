package com.ihowq.VTopic.util.cache;

import com.ihowq.VTopic.util.Result;

import java.util.Collection;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Redis缓存
 *
 * @author howq
 * @create 2017-03-15 14:17
 **/
public interface IRedisCacheService {
    Result<String> saveByKey(String var1, String var2);

    Result<String> saveByObject(String var1, Object var2);

    Result<String> saveByObject(String var1, Object var2, int var3);

    Result<String> getByKey(String var1);

    Result<String> getByObject(String var1);

    void delByKey(String var1);

    void batchDeleteByCollection(Collection<String> var1);

    void modifyByKey(String var1, String var2);

    Set<String> getKeys(String var1);

    Long getIncrementQueueByKey(String var1);

    Long decreaseByKey(String var1);

    void setExpireTime(String var1, Long var2);

    void setex(String var1, int var2, String var3);

    boolean exists(String var1);

    String getLock(String var1, Long var2);

    Boolean releaseLock(String var1, String var2);

    void rpush(String var1, String var2);

    Object getByClass(String var1, Class<?> var2);

    int lrang(String var1);

    void ltrim(String var1);

    Result<String> saveByObject(String var1, Object var2, int var3, TimeUnit var4);
}
