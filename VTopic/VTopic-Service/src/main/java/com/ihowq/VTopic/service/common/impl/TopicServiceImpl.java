package com.ihowq.VTopic.service.common.impl;

import com.github.pagehelper.PageHelper;
import com.ihowq.VTopic.dao.TopicMapper;
import com.ihowq.VTopic.dto.CommonTopic;
import com.ihowq.VTopic.model.Topic;
import com.ihowq.VTopic.model.UserInfo;
import com.ihowq.VTopic.service.cache.model.CustLoginSession;
import com.ihowq.VTopic.service.VTopicServiceBase;
import com.ihowq.VTopic.service.common.TopicService;
import com.ihowq.VTopic.util.DateUtil;
import com.ihowq.VTopic.util.PageBean;
import com.ihowq.VTopic.util.common.VTopicConst;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.security.DigestException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;

/**
 * The type Topic service.
 *
 * @author howq
 * @create 2017 -03-25 15:51
 */
@Service(value = "topicService")
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
        List<CommonTopic> list = null;
        UserInfo userInfo = loginSession.getUserInfo();
        if (VTopicConst.ROLE_MANAGER_CODE == userInfo.getRoleid()) {

        }else if (VTopicConst.ROLE_TEACHER_CODE == userInfo.getRoleid()) {
            list = topicMapper.selectWithTeacher(userInfo.getUserid());
        } else if (VTopicConst.ROLE_STUDENT_CODE == userInfo.getRoleid()) {

        }
        logger.info("获取课题题目列表成功");
        return new PageBean<CommonTopic>(list);
    }

    @Override
    public void delTopic(Long topicId, HttpServletRequest request) throws DataAccessException, DigestException, NoSuchAlgorithmException {
        CustLoginSession loginSession = sessionService.getSession(request);
        UserInfo userInfo = loginSession.getUserInfo();
        Topic topic = new Topic();
        topic.setTopicid(topicId);
        topic.setDeletedatetime(DateUtil.getTimeStamp());
        topic.setDeleteman(userInfo.getUserid());
        topic.setChangedatetime(DateUtil.getTimeStamp());
        topic.setChanger(userInfo.getUserid());
        topicMapper.updateByPrimaryKeySelective(topic);
        logger.info("删除教师题目成功");
    }

    @Override
    public void saveOrUpdateTopic(Topic topic, boolean isUpdate, HttpServletRequest request) throws DataAccessException, DigestException, NoSuchAlgorithmException {
        CustLoginSession loginSession = sessionService.getSession(request);
        UserInfo userInfo = loginSession.getUserInfo();

        Date date = DateUtil.getTimeStamp();
        topic.setChanger(userInfo.getUserid());
        topic.setChangedatetime(date);
        if (!isUpdate) {
            topic.setCreater(userInfo.getUserid());
            topic.setCreatdatetime(DateUtil.getTimeStamp());
            topic.setDeleteflg("0");
            topicMapper.insert(topic);
            logger.info("新增题目成功");
        } else {
            topicMapper.updateByPrimaryKeySelective(topic);
            logger.info("修改题目成功");
        }
    }
}
