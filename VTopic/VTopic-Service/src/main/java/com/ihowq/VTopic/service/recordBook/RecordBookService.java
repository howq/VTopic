package com.ihowq.VTopic.service.recordBook;

import com.ihowq.VTopic.dto.CommonRecordBook;
import com.ihowq.VTopic.util.PageBean;
import org.springframework.dao.DataAccessException;

/**
 * The interface Manage service.
 *
 * @author howq
 * @create 2017 -03-24 23:54
 */
public interface RecordBookService {

    /**
     * Gets record books.
     *
     * @param startPage the start page
     * @param pageSize  the page size
     * @return the record books
     * @throws DataAccessException the data access exception
     */
    public PageBean<CommonRecordBook> getRecordBooks(int startPage, int pageSize) throws DataAccessException;

}
