package com.ihowq.VTopic.dao;

import com.ihowq.VTopic.dto.CommonRecord;
import com.ihowq.VTopic.model.Record;

import java.util.List;

public interface RecordMapper {
    int deleteByPrimaryKey(Long recordid);

    int insert(Record record);

    int insertSelective(Record record);

    Record selectByPrimaryKey(Long recordid);

    List<CommonRecord> selectRecord(Record record);

    int updateByPrimaryKeySelective(Record record);

    int updateByPrimaryKey(Record record);
}