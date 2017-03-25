package com.ihowq.VTopic.service.manager;

import com.ihowq.VTopic.dto.CommonRecordBook;
import com.ihowq.VTopic.util.PageBean;
import org.springframework.dao.DataAccessException;

/**
 * @author howq
 * @create 2017-03-24 23:54
 **/
public interface ManageService {

    public PageBean<CommonRecordBook> getRecordBooks(int startPage, int pageSize) throws DataAccessException;

}
