package com.ihowq.VTopic.service.manager;

import com.ihowq.VTopic.model.RecordBook;
import com.ihowq.VTopic.util.PageBean;

/**
 * @author howq
 * @create 2017-03-24 23:54
 **/
public interface ManageService {

    public PageBean<RecordBook> getRecordBookList(int startPage,int pageSize);

}
