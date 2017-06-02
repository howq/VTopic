package com.ihowq.VTopic.service.common;

import com.ihowq.VTopic.dto.CommonCategory;
import com.ihowq.VTopic.model.Category;
import org.apache.ibatis.annotations.Param;
import org.springframework.dao.DataAccessException;

import javax.servlet.http.HttpServletRequest;
import java.security.DigestException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 * The interface Category service.
 *
 * @author howq
 * @create 2017 -04-30 下午12:06
 */
public interface CategoryService {

    /**
     * Gets categories.
     *
     * @return the categories
     * @throws DataAccessException the data access exception
     */
    public List<CommonCategory> getCategories() throws DataAccessException;


    /**
     * Del category.
     *
     * @param CategoryId the category id
     * @param request    the request
     * @throws DataAccessException      the data access exception
     * @throws DigestException          the digest exception
     * @throws NoSuchAlgorithmException the no such algorithm exception
     */
    public void delCategory(Long CategoryId, HttpServletRequest request) throws DataAccessException, DigestException, NoSuchAlgorithmException;


    /**
     * Save or update category.
     *
     * @param category the common category
     * @param isUpdate the is update
     * @param request  the request
     * @throws DataAccessException      the data access exception
     * @throws DigestException          the digest exception
     * @throws NoSuchAlgorithmException the no such algorithm exception
     */
    public void saveOrUpdateCategory(Category category, boolean isUpdate, HttpServletRequest request) throws DataAccessException, DigestException, NoSuchAlgorithmException;

}