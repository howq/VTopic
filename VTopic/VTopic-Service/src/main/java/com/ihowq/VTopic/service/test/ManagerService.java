package com.ihowq.VTopic.service.test;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Redis 缓存测试
 *
 * @author howq
 * @create 2017-03-15 14:17
 **/
@Service("managerService")
public class ManagerService {
    @Cacheable(value = "User", key = "'UserId_' + #id",condition = "#id<=110")
    public String queryFullNameById(long id) {
        System.out.println("execute queryFullNameById method");
        return "ZhangSanFeng";
    }

    @CacheEvict(value = "User", key = "'UserId_' + #id")
    public void deleteById(long id) {
        System.out.println("execute deleteById method");
    }

    @CachePut(value = "User", key = "'UserId_' + #id")
    public String modifyFullNameById(long id, String newName) {
        System.out.println("execute modifyFullNameById method");
        return newName;
    }
}
