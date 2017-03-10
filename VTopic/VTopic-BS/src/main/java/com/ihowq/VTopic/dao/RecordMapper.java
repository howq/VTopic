package com.ihowq.VTopic.dao;

import com.ihowq.VTopic.model.Record;
import com.ihowq.VTopic.model.RecordKey;
import org.springframework.stereotype.Repository;

public interface RecordMapper {
    int deleteByPrimaryKey(RecordKey key);

    int insert(Record record);

    int insertSelective(Record record);

    Record selectByPrimaryKey(RecordKey key);

    int updateByPrimaryKeySelective(Record record);

    int updateByPrimaryKey(Record record);
}