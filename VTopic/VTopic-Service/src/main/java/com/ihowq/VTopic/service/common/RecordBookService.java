package com.ihowq.VTopic.service.common;

import com.ihowq.VTopic.dto.CommonRecordBook;
import com.ihowq.VTopic.model.RecordBook;
import com.ihowq.VTopic.util.PageBean;
import org.springframework.dao.DataAccessException;

import javax.servlet.http.HttpServletRequest;
import java.security.DigestException;
import java.security.NoSuchAlgorithmException;

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


    /**
     * Del recod book.
     *
     * @param bookId  the book id
     * @param request the request
     * @throws DataAccessException the data access exception
     */
    public void delRecodBook(Long bookId, HttpServletRequest request) throws DataAccessException, DigestException, NoSuchAlgorithmException;


    /**
     * Save or update recod book.
     *
     * @param recordBook the record book
     * @param isUpdate   the is update
     * @param request    the request
     * @throws DataAccessException      the data access exception
     * @throws DigestException          the digest exception
     * @throws NoSuchAlgorithmException the no such algorithm exception
     */
    public void saveOrUpdateRecodBook(RecordBook recordBook, boolean isUpdate, HttpServletRequest request) throws DataAccessException, DigestException, NoSuchAlgorithmException;
}
