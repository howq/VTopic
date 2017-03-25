package com.ihowq.VTopic.service.topic.impl;

import com.github.pagehelper.PageHelper;
import com.ihowq.VTopic.dao.TopicMapper;
import com.ihowq.VTopic.dto.CommonTopic;
import com.ihowq.VTopic.service.cache.model.CustLoginSession;
import com.ihowq.VTopic.service.common.VTopicServiceBase;
import com.ihowq.VTopic.service.topic.TopicService;
import com.ihowq.VTopic.util.PageBean;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author howq
 * @create 2017-03-25 15:51
 **/
@Service
public class TopicServiceImpl extends VTopicServiceBase implements TopicService {

    @Resource(name = "topicMapper")
    private TopicMapper topicMapper;

    public PageBean<CommonTopic> getTopics(int startPage, int pageSize, HttpServletRequest request) throws DataAccessException {
        PageHelper.startPage(startPage, pageSize);
        CustLoginSession loginSession = null;
        try {
            loginSession = sessionService.getSession(request);
        } catch (Exception e) {
            logger.error("获取Session失败" + e.getMessage());
            return new PageBean<CommonTopic>(null);
        }
        List<CommonTopic> list = topicMapper.selectWithTeacher(loginSession.getUserid());
        logger.info("获取课题题目列表成功");
        return new PageBean<CommonTopic>(list);
    }
}
