package com.ihowq.VTopic.dao;

import com.ihowq.VTopic.model.Record;

public interface RecordMapper {
    int deleteByPrimaryKey(Long recordid);

    int insert(Record record);

    int insertSelective(Record record);

    Record selectByPrimaryKey(Long recordid);

    int updateByPrimaryKeySelective(Record record);

    int updateByPrimaryKey(Record record);
}