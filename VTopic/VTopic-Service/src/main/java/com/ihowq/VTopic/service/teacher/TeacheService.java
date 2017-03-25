package com.ihowq.VTopic.service.teacher;

import com.ihowq.VTopic.dto.CommonRecord;
import com.ihowq.VTopic.util.PageBean;
import org.springframework.dao.DataAccessException;

/**
 * @author howq
 * @create 2017-03-25 15:50
 **/
public interface TeacheService {

    public PageBean<CommonRecord> getRecords(int startPage, int pageSize) throws DataAccessException;

}
