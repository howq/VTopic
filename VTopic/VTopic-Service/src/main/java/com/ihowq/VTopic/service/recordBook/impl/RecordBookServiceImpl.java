package com.ihowq.VTopic.service.recordBook.impl;

import com.github.pagehelper.PageHelper;
import com.ihowq.VTopic.dao.RecordBookMapper;
import com.ihowq.VTopic.dto.CommonRecordBook;
import com.ihowq.VTopic.service.common.VTopicServiceBase;
import com.ihowq.VTopic.service.recordBook.RecordBookService;
import com.ihowq.VTopic.util.PageBean;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author howq
 * @create 2017-03-24 23:56
 **/
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
}
