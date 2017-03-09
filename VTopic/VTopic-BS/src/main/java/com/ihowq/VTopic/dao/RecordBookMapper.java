package com.ihowq.VTopic.dao;

import com.ihowq.VTopic.model.RecordBook;
import com.ihowq.VTopic.model.RecordBookKey;

public interface RecordBookMapper {
    int deleteByPrimaryKey(RecordBookKey key);

    int insert(RecordBook record);

    int insertSelective(RecordBook record);

    RecordBook selectByPrimaryKey(RecordBookKey key);

    int updateByPrimaryKeySelective(RecordBook record);

    int updateByPrimaryKey(RecordBook record);
}