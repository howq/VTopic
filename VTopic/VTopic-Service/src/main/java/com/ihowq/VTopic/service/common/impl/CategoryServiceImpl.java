package com.ihowq.VTopic.service.common.impl;

import com.ihowq.VTopic.dao.CategoryMapper;
import com.ihowq.VTopic.dto.CommonCategory;
import com.ihowq.VTopic.model.Category;
import com.ihowq.VTopic.model.UserInfo;
import com.ihowq.VTopic.service.VTopicServiceBase;
import com.ihowq.VTopic.service.cache.model.CustLoginSession;
import com.ihowq.VTopic.service.common.CategoryService;
import com.ihowq.VTopic.util.DateUtil;
import com.ihowq.VTopic.util.common.VTopicConst;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.security.DigestException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;

/**
 * @author howq
 * @create 2017-04-30 下午12:09
 **/
@Service(value = "categoryService")
public class CategoryServiceImpl extends VTopicServiceBase implements CategoryService {

    @Resource(name = "categoryMapper")
    private CategoryMapper categoryMapper;

    @Override
    public List<CommonCategory> getCategories() throws DataAccessException {
        List<CommonCategory> list = categoryMapper.selectCategory();
        logger.info("获取目录列表成功");
        return list;
    }

    @Override
    public void delCategory(Long CategoryId, HttpServletRequest request) throws DataAccessException, DigestException, NoSuchAlgorithmException {
        CustLoginSession loginSession = sessionService.getSession(request);
        UserInfo userInfo = loginSession.getUserInfo();
        Category category = new Category();
        category.setCategoryid(CategoryId);
        category.setDeleteflg(VTopicConst.DELETE_FLAG_YES);
        category.setDeletedatetime(DateUtil.getTimeStamp());
        category.setDeleteman(userInfo.getUserid());
        category.setChangedatetime(DateUtil.getTimeStamp());
        category.setChanger(userInfo.getUserid());
        categoryMapper.updateByPrimaryKeySelective(category);
        logger.info("删除目录成功");
    }

    @Override
    public void saveOrUpdateCategory(Category category, boolean isUpdate, HttpServletRequest request) throws DataAccessException, DigestException, NoSuchAlgorithmException {
        CustLoginSession loginSession = sessionService.getSession(request);
        UserInfo userInfo = loginSession.getUserInfo();

        Date date = DateUtil.getTimeStamp();
        category.setChanger(userInfo.getUserid());
        category.setChangedatetime(date);
        if (!isUpdate) {
            category.setCreater(userInfo.getUserid());
            category.setCreatdatetime(DateUtil.getTimeStamp());
            category.setDeleteflg(VTopicConst.DELETE_FLAG_NO);
            categoryMapper.insert(category);
            logger.info("新增目录成功");
        } else {
            categoryMapper.updateByPrimaryKeySelective(category);
            logger.info("修改目录成功");
        }
    }
}