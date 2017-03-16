package com.ihowq.VTopic.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @author howq
 * @create 2017-03-16 14:28
 **/
public class BeanDefineConfigue implements ApplicationListener<ContextRefreshedEvent> {

    private final static Logger logger = LoggerFactory.getLogger(BeanDefineConfigue.class);

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        if (contextRefreshedEvent.getApplicationContext().getParent() == null) {
            logger.info("spring容器启动完成:" + contextRefreshedEvent.getApplicationContext().getApplicationName());
            logger.info("----spring容器:" + contextRefreshedEvent.getApplicationContext().getApplicationName() + "启动完成-----");
        }
    }
}
