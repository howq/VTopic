package com.ihowq.VTopic.dao;

import com.ihowq.VTopic.dto.CommonRecordBook;
import com.ihowq.VTopic.model.RecordBook;

import java.util.List;

public interface RecordBookMapper {
    int deleteByPrimaryKey(Long recordbookid);

    int insert(RecordBook record);

    int insertSelective(RecordBook record);

    RecordBook selectByPrimaryKey(Long recordbookid);

    public List<CommonRecordBook> selectRecordBook();

    int updateByPrimaryKeySelective(RecordBook record);

    int updateByPrimaryKey(RecordBook record);
}