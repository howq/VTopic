package com.ihowq.VTopic.service.common.impl;

import com.github.pagehelper.PageHelper;
import com.ihowq.VTopic.dao.RecordBookMapper;
import com.ihowq.VTopic.dto.CommonRecordBook;
import com.ihowq.VTopic.model.RecordBook;
import com.ihowq.VTopic.model.UserInfo;
import com.ihowq.VTopic.service.cache.model.CustLoginSession;
import com.ihowq.VTopic.service.VTopicServiceBase;
import com.ihowq.VTopic.service.common.RecordBookService;
import com.ihowq.VTopic.util.DateUtil;
import com.ihowq.VTopic.util.PageBean;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.security.DigestException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;

/**
 * The type RecordService book service.
 *
 * @author howq
 * @create 2017 -03-24 23:56
 */
@Service
public class RecordBookServiceImpl extends VTopicServiceBase implements RecordBookService {

    @Resource(name = "recordBookMapper")
    private RecordBookMapper recordBookMapper;

    @Override
    public PageBean<CommonRecordBook> getRecordBooks(int startPage, int pageSize) throws DataAccessException {
        PageHelper.startPage(startPage, pageSize);
        List<CommonRecordBook> list = recordBookMapper.selectRecordBook();
        logger.info("获取每年开题记录成功");
        return new PageBean<CommonRecordBook>(list);
    }

    @Override
    public void delRecodBook(Long bookId, HttpServletRequest request) throws DataAccessException, DigestException, NoSuchAlgorithmException {
        RecordBook recordBook = new RecordBook();
        recordBook.setRecordbookid(bookId);
        recordBook.setDeleteflg("1");
        recordBook.setDeletedatetime(DateUtil.getTimeStamp());
        CustLoginSession loginSession = sessionService.getSession(request);
        UserInfo userInfo = loginSession.getUserInfo();
        recordBook.setChanger(userInfo.getUserid());
        recordBook.setChangedatetime(DateUtil.getTimeStamp());
        recordBook.setDeleteman(userInfo.getUserid());
        recordBook.setDeletedatetime(DateUtil.getTimeStamp());
        recordBookMapper.updateByPrimaryKeySelective(recordBook);
        logger.info("删除开题记录成功");
    }

    @Override
    public void saveOrUpdateRecodBook(RecordBook recordBook, boolean isUpdate, HttpServletRequest request) throws DataAccessException, DigestException, NoSuchAlgorithmException {
        CustLoginSession loginSession = sessionService.getSession(request);
        UserInfo userInfo = loginSession.getUserInfo();

        Date date = DateUtil.getTimeStamp();
        int year = DateUtil.getYear(date);
        recordBook.setChanger(userInfo.getUserid());
        recordBook.setChangedatetime(date);
        recordBook.setManagerid(userInfo.getUserid());

        if (!isUpdate) {
            recordBook.setVyear(String.valueOf(year));
            recordBook.setCreater(userInfo.getUserid());
            recordBook.setCreatdatetime(DateUtil.getTimeStamp());
            recordBook.setDeleteflg("0");
            recordBookMapper.insert(recordBook);
            logger.info("新增开题记录成功");
        } else {
            recordBookMapper.updateByPrimaryKeySelective(recordBook);
            logger.info("更新开题记录成功");
        }
    }
}
