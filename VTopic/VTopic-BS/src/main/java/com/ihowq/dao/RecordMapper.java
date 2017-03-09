package com.ihowq.dao;

import com.ihowq.model.Record;
import com.ihowq.model.RecordKey;

public interface RecordMapper {
    int deleteByPrimaryKey(RecordKey key);

    int insert(Record record);

    int insertSelective(Record record);

    Record selectByPrimaryKey(RecordKey key);

    int updateByPrimaryKeySelective(Record record);

    int updateByPrimaryKey(Record record);
}