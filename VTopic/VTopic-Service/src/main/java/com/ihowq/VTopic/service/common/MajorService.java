package com.ihowq.VTopic.service.common;

import com.ihowq.VTopic.dto.CommonMajor;
import com.ihowq.VTopic.model.Major;
import org.springframework.dao.DataAccessException;

import javax.servlet.http.HttpServletRequest;
import java.security.DigestException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 * The interface Major service.
 *
 * @author howq
 * @create 2017 -04-30 上午11:16
 */
public interface MajorService {


    /**
     * Gets majors.
     *
     * @param startPage the start page
     * @param pageSize  the page size
     * @param request   the request
     * @return the majors
     * @throws DataAccessException the data access exception
     */
    public List<CommonMajor> getMajors() throws DataAccessException;


    /**
     * Del major.
     *
     * @param majorId the major id
     * @param request the request
     * @throws DataAccessException      the data access exception
     * @throws DigestException          the digest exception
     * @throws NoSuchAlgorithmException the no such algorithm exception
     */
    public void delMajor(Long majorId, HttpServletRequest request) throws DataAccessException, DigestException, NoSuchAlgorithmException;


    /**
     * Save or update major.
     *
     * @param major    the major
     * @param isUpdate the is update
     * @param request  the request
     * @throws DataAccessException      the data access exception
     * @throws DigestException          the digest exception
     * @throws NoSuchAlgorithmException the no such algorithm exception
     */
    public void saveOrUpdateMajor(Major major, boolean isUpdate, HttpServletRequest request) throws DataAccessException, DigestException, NoSuchAlgorithmException;

}