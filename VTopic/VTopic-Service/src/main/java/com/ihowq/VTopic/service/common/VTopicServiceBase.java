package com.ihowq.VTopic.service.common;

import com.ihowq.VTopic.service.cache.SessionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Service 基类
 *
 * @author howq
 * @create 2017-03-24 10:33
 **/
@Service
@Transactional(
        propagation = Propagation.REQUIRED,
        isolation = Isolation.DEFAULT,
        rollbackFor = { RuntimeException.class, Exception.class })
public abstract class VTopicServiceBase {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    protected SessionService sessionService;

}
