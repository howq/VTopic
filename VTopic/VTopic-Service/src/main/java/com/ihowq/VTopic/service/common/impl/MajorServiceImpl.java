package com.ihowq.VTopic.service.common.impl;

import com.github.pagehelper.PageHelper;
import com.ihowq.VTopic.dao.MajorMapper;
import com.ihowq.VTopic.dto.CommonMajor;
import com.ihowq.VTopic.model.Major;
import com.ihowq.VTopic.model.UserInfo;
import com.ihowq.VTopic.service.VTopicServiceBase;
import com.ihowq.VTopic.service.cache.model.CustLoginSession;
import com.ihowq.VTopic.service.common.MajorService;
import com.ihowq.VTopic.util.DateUtil;
import com.ihowq.VTopic.util.PageBean;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.security.DigestException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;

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
    public List<CommonMajor> getMajors() throws DataAccessException {
        List<CommonMajor> list = majorMapper.selectMajor();
        logger.info("获取每年开题记录成功");
        return list;
    }

    @Override
    public void delMajor(Long majorId, HttpServletRequest request) throws DataAccessException, DigestException, NoSuchAlgorithmException {
        CustLoginSession loginSession = sessionService.getSession(request);
        UserInfo userInfo = loginSession.getUserInfo();
        Major major = new Major();
        major.setDeleteflg("1");
        major.setMajorid(majorId);
        major.setDeletedatetime(DateUtil.getTimeStamp());
        major.setDeleteman(userInfo.getUserid());
        major.setChangedatetime(DateUtil.getTimeStamp());
        major.setChanger(userInfo.getUserid());
        majorMapper.updateByPrimaryKeySelective(major);
        logger.info("删除专业成功");
    }

    @Override
    public void saveOrUpdateMajor(Major major, boolean isUpdate, HttpServletRequest request) throws DataAccessException, DigestException, NoSuchAlgorithmException {
        CustLoginSession loginSession = sessionService.getSession(request);
        UserInfo userInfo = loginSession.getUserInfo();

        Date date = DateUtil.getTimeStamp();
        major.setChanger(userInfo.getUserid());
        major.setChangedatetime(date);
        if (!isUpdate) {
            major.setCreater(userInfo.getUserid());
            major.setCreatdatetime(DateUtil.getTimeStamp());
            major.setDeleteflg("0");
            majorMapper.insert(major);
            logger.info("新增专业成功");
        } else {
            majorMapper.updateByPrimaryKeySelective(major);
            logger.info("修改专业成功");
        }
    }
}