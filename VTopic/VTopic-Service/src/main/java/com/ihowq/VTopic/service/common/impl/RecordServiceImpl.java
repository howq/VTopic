package com.ihowq.VTopic.service.common.impl;

import com.ihowq.VTopic.dao.RecordMapper;
import com.ihowq.VTopic.dto.CommonRecord;
import com.ihowq.VTopic.model.Record;
import com.ihowq.VTopic.service.VTopicServiceBase;
import com.ihowq.VTopic.service.common.RecordService;
import com.ihowq.VTopic.util.PageBean;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.security.DigestException;
import java.security.NoSuchAlgorithmException;

/**
 * The type Record service.
 *
 * @author howq
 * @create 2017 -04-01 15:51
 */
@Service(value = "recordService")
public class RecordServiceImpl extends VTopicServiceBase implements RecordService {

    @Resource(name = "recordMapper")
    private RecordMapper recordMapper;

    @Override
    public PageBean<CommonRecord> getRecords(int startPage, int pageSize, HttpServletRequest request) throws DataAccessException {
        return null;
    }

    @Override
    public void delRecord(Long recordId, HttpServletRequest request) throws DataAccessException, DigestException, NoSuchAlgorithmException {

    }

    @Override
    public void saveOrUpdateRecord(Record record, boolean isUpdate, HttpServletRequest request) throws DataAccessException, DigestException, NoSuchAlgorithmException {

    }
}
