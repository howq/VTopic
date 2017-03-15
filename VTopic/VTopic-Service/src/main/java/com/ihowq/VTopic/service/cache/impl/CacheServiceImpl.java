package com.ihowq.VTopic.service.cache.impl;

import com.ihowq.VTopic.service.cache.CacheService;
import com.ihowq.VTopic.service.cache.model.CustLoginSession;
import com.ihowq.VTopic.util.Result;
import com.ihowq.VTopic.util.ValSystemException;
import com.ihowq.VTopic.util.cache.impl.RedisCacheService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 分布式缓存服务。
 *
 * @author howq
 */
@Service("cacheService")
public class CacheServiceImpl implements CacheService {

    private static final Logger logger = LoggerFactory.getLogger(CacheServiceImpl.class);

    @Resource(name = "redisCacheService")
    private RedisCacheService redisCacheService;

    @Override
    public void setCustLoginSession(CustLoginSession session) {
        if (session != null) {
            logger.debug("Put login session to cahce. token:" + session.getToken());

            int custLoginSessionExpireTime = 60*60*30;

            Result<String> result = redisCacheService.saveByObject(session.getToken(), session, custLoginSessionExpireTime);
            if (!result.isSuccess()) {
                logger.warn("Failed to save login session to cache.");
                throw new ValSystemException("Failed to save login session to cache.");
            }
            logger.debug("Put login session to redis success");
        }
    }

    @Override
    public CustLoginSession getCustLoginSession(String token) {
        if (token != null) {

            logger.debug("Get login session from cache. token:" + token);

            CustLoginSession loginSession = null;
            loginSession = (CustLoginSession) redisCacheService.getByClass(token, CustLoginSession.class);

            return loginSession;
        }

        return null;
    }

    @Override
    public void removeCustLoginSession(String token) {
        if (token != null) {

            logger.debug("Remove login session from cahce. token:" + token);

            redisCacheService.delByKey(token);
        }
    }
}
