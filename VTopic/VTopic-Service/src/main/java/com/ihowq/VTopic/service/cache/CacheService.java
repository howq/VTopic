package com.ihowq.VTopic.service.cache;

import com.ihowq.VTopic.service.cache.model.CustLoginSession;

/**
 * 分布式缓存服务。
 *
 * @author howq
 */
public interface CacheService {

    /**
     * 设置登入Session服务。
     *
     * @param session 登入会话。
     * @throws Exception
     */
    public void setCustLoginSession(CustLoginSession session);

    /**
     * 得到登入Session服务。
     *
     * @param token 登入会话编号。
     * @return
     */
    public CustLoginSession getCustLoginSession(String token);

    /**
     * 删除登入缓存对象。
     *
     * @param token
     */
    public void removeCustLoginSession(String token);
}
