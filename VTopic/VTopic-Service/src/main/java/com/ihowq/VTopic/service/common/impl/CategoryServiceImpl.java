package com.ihowq.VTopic.service.common.impl;

import com.ihowq.VTopic.dao.CategoryMapper;
import com.ihowq.VTopic.dto.CommonCategory;
import com.ihowq.VTopic.service.VTopicServiceBase;
import com.ihowq.VTopic.service.common.CategoryService;
import com.ihowq.VTopic.util.PageBean;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.security.DigestException;
import java.security.NoSuchAlgorithmException;

/**
 * @author howq
 * @create 2017-04-30 下午12:09
 **/
@Service(value = "categoryService")
public class CategoryServiceImpl extends VTopicServiceBase implements CategoryService {

    @Resource(name = "categoryMapper")
    private CategoryMapper categoryMapper;

    @Override
    public PageBean<CommonCategory> getCategories(int startPage, int pageSize, HttpServletRequest request) throws DataAccessException {
        return null;
    }

    @Override
    public void delCategory(Long CategoryId, HttpServletRequest request) throws DataAccessException, DigestException, NoSuchAlgorithmException {

    }

    @Override
    public void saveOrUpdateCategory(CommonCategory commonCategory, boolean isUpdate, HttpServletRequest request) throws DataAccessException, DigestException, NoSuchAlgorithmException {

    }
}