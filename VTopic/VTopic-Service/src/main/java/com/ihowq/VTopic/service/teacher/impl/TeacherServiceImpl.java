package com.ihowq.VTopic.service.teacher.impl;

import com.ihowq.VTopic.dao.RecordMapper;
import com.ihowq.VTopic.dto.CommonRecord;
import com.ihowq.VTopic.service.teacher.TeacheService;
import com.ihowq.VTopic.util.PageBean;
import org.springframework.dao.DataAccessException;

import javax.annotation.Resource;

/**
 * @author howq
 * @create 2017-03-25 15:51
 **/
public class TeacherServiceImpl implements TeacheService {

    @Resource
    private RecordMapper recordMapper;

    public PageBean<CommonRecord> getRecords(int startPage, int pageSize) throws DataAccessException{

        return null;
    }
}
