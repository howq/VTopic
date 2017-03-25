package com.ihowq.VTopic.service.manager.impl;

import com.github.pagehelper.PageHelper;
import com.ihowq.VTopic.dao.RecordBookMapper;
import com.ihowq.VTopic.dto.CommonRecordBook;
import com.ihowq.VTopic.service.manager.ManageService;
import com.ihowq.VTopic.util.PageBean;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author howq
 * @create 2017-03-24 23:56
 **/
@Service
public class ManageServiceImpl implements ManageService {

    protected final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource(name = "recordBookMapper")
    private RecordBookMapper recordBookMapper;

    @Override
    public PageBean<CommonRecordBook> getRecordBooks(int startPage, int pageSize) throws DataAccessException {
        PageHelper.startPage(startPage, pageSize);
        List<CommonRecordBook> list = recordBookMapper.selectRecordBook();
        return new PageBean<CommonRecordBook>(list);
    }
}
