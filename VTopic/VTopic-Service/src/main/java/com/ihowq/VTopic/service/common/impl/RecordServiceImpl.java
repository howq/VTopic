package com.ihowq.VTopic.service.common.impl;

import com.github.pagehelper.PageHelper;
import com.ihowq.VTopic.dao.RecordMapper;
import com.ihowq.VTopic.dao.TopicMapper;
import com.ihowq.VTopic.dto.CommonRecord;
import com.ihowq.VTopic.model.Record;
import com.ihowq.VTopic.model.Topic;
import com.ihowq.VTopic.model.UserInfo;
import com.ihowq.VTopic.service.VTopicServiceBase;
import com.ihowq.VTopic.service.cache.model.CustLoginSession;
import com.ihowq.VTopic.service.common.RecordService;
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
 * The type Record service.
 *
 * @author howq
 * @create 2017 -04-01 15:51
 */
@Service(value = "recordService")
public class RecordServiceImpl extends VTopicServiceBase implements RecordService {

    @Resource(name = "recordMapper")
    private RecordMapper recordMapper;

    @Resource(name="topicMapper")
    private TopicMapper topicMapper;

    @Override
    public PageBean<CommonRecord> getRecords(int startPage, int pageSize, HttpServletRequest request) throws DataAccessException {
        PageHelper.startPage(startPage, pageSize);
        CustLoginSession loginSession = null;
        try {
            loginSession = sessionService.getSession(request);
        } catch (Exception e) {
            logger.error("获取Session失败" + e.getMessage());
            return new PageBean<>(null);
        }
        List<CommonRecord> list = null;
        UserInfo userInfo = loginSession.getUserInfo();
        if (VTopicConst.ROLE_MANAGER_CODE == userInfo.getRoleid()) {

        } else if (VTopicConst.ROLE_TEACHER_CODE == userInfo.getRoleid()) {
//            list = recordMapper.selectWithTeacher(userInfo.getUserid());
        } else if (VTopicConst.ROLE_STUDENT_CODE == userInfo.getRoleid()) {

        }
        logger.info("获取选题记录列表成功");
        return new PageBean<>(list);
    }

    @Override
    public void delRecord(Long recordId, HttpServletRequest request) throws DataAccessException, DigestException, NoSuchAlgorithmException {
        Record record = new Record();
        record.setRecordid(recordId);
        record.setDeleteflg("1");
        record.setDeletedatetime(DateUtil.getTimeStamp());
        CustLoginSession loginSession = sessionService.getSession(request);
        UserInfo userInfo = loginSession.getUserInfo();
        record.setChanger(userInfo.getUserid());
        record.setChangedatetime(DateUtil.getTimeStamp());
        record.setDeleteman(userInfo.getUserid());
        record.setDeletedatetime(DateUtil.getTimeStamp());
        recordMapper.updateByPrimaryKeySelective(record);
        logger.info("删除选题记录成功");
    }

    @Override
    public void saveOrUpdateRecord(Record record, boolean isUpdate, HttpServletRequest request) throws DataAccessException, DigestException, NoSuchAlgorithmException {
        CustLoginSession loginSession = sessionService.getSession(request);
        UserInfo userInfo = loginSession.getUserInfo();

        Date date = DateUtil.getTimeStamp();

        if (VTopicConst.ROLE_MANAGER_CODE == userInfo.getRoleid()) {
            Topic topic = topicMapper.selectByPrimaryKey(record.getTopicid());
            record.setTeacher(topic.getTeacher());
        } else if (VTopicConst.ROLE_TEACHER_CODE == userInfo.getRoleid()) {
            record.setTeacher(userInfo.getUserid());
        } else if (VTopicConst.ROLE_STUDENT_CODE == userInfo.getRoleid()) {
            record.setStudent(userInfo.getUserid());
        }

        record.setOperater(userInfo.getUserid());
        record.setChanger(userInfo.getUserid());
        record.setChangedatetime(date);
        if (!isUpdate) {
            record.setCreater(userInfo.getUserid());
            record.setCreatdatetime(DateUtil.getTimeStamp());
            record.setDeleteflg("0");
            recordMapper.insert(record);
            logger.info("新增选题记录成功");
        } else {
            recordMapper.updateByPrimaryKeySelective(record);
            logger.info("修改选题记录成功");
        }
    }
}
