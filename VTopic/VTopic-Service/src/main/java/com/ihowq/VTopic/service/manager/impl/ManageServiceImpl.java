package com.ihowq.VTopic.service.manager.impl;

import com.github.pagehelper.PageHelper;
import com.ihowq.VTopic.dao.RecordBookMapper;
import com.ihowq.VTopic.model.RecordBook;
import com.ihowq.VTopic.service.manager.ManageService;
import com.ihowq.VTopic.util.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author howq
 * @create 2017-03-24 23:56
 **/
@Service
public class ManageServiceImpl implements ManageService {

    @Resource(name = "recordBookMapper")
    private RecordBookMapper recordBookMapper;

    @Override
    public PageBean<RecordBook> getRecordBookList(int startPage, int pageSize) {

        PageHelper.startPage(startPage, pageSize);
        List<RecordBook> list = null;
        return new PageBean<RecordBook>(list);
    }
}
