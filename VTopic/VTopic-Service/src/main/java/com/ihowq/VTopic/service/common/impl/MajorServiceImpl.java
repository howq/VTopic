package com.ihowq.VTopic.service.common.impl;

import com.ihowq.VTopic.dao.MajorMapper;
import com.ihowq.VTopic.dto.CommonMajor;
import com.ihowq.VTopic.model.Major;
import com.ihowq.VTopic.service.VTopicServiceBase;
import com.ihowq.VTopic.service.common.MajorService;
import com.ihowq.VTopic.util.PageBean;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.security.DigestException;
import java.security.NoSuchAlgorithmException;

/**
 * The type Major service.
 *
 * @author howq
 * @create 2017 -04-30 下午12:09
 */
@Service(value = "majorService")
public class MajorServiceImpl extends VTopicServiceBase implements MajorService{

    @Resource(name = "majorMapper")
    private MajorMapper majorMapper;

    @Override
    public PageBean<CommonMajor> getMajors(int startPage, int pageSize, HttpServletRequest request) throws DataAccessException {
        return null;
    }

    @Override
    public void delMajor(Long majorId, HttpServletRequest request) throws DataAccessException, DigestException, NoSuchAlgorithmException {

    }

    @Override
    public void saveOrUpdateMajor(Major major, boolean isUpdate, HttpServletRequest request) throws DataAccessException, DigestException, NoSuchAlgorithmException {

    }
}