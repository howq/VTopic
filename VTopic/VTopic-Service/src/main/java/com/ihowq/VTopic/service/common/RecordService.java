package com.ihowq.VTopic.service.common;

import com.ihowq.VTopic.dto.CommonRecord;
import com.ihowq.VTopic.model.Record;
import com.ihowq.VTopic.util.PageBean;
import org.springframework.dao.DataAccessException;

import javax.servlet.http.HttpServletRequest;
import java.security.DigestException;
import java.security.NoSuchAlgorithmException;

/**
 * The interface RecordService service.
 *
 * @author howq
 * @create 2017 -04-01 15:51
 */
public interface RecordService {

    /**
     * Gets records.
     *
     * @param startPage the start page
     * @param pageSize  the page size
     * @param request   the request
     * @return the records
     * @throws DataAccessException the data access exception
     */
    public PageBean<CommonRecord> getRecords(int startPage, int pageSize, HttpServletRequest request) throws DataAccessException;

    /**
     * Del record.
     *
     * @param recordId the record id
     * @param request  the request
     * @throws DataAccessException      the data access exception
     * @throws DigestException          the digest exception
     * @throws NoSuchAlgorithmException the no such algorithm exception
     */
    public void delRecord(Long recordId, HttpServletRequest request) throws DataAccessException, DigestException, NoSuchAlgorithmException;

    /**
     * Save or update record.
     *
     * @param record   the record
     * @param isUpdate the is update
     * @param request  the request
     * @throws DataAccessException      the data access exception
     * @throws DigestException          the digest exception
     * @throws NoSuchAlgorithmException the no such algorithm exception
     */
    public void saveOrUpdateRecord(Record record, boolean isUpdate, HttpServletRequest request) throws DataAccessException, DigestException, NoSuchAlgorithmException;

}
