package com.ihowq.dao;

import com.ihowq.model.RecordBook;
import com.ihowq.model.RecordBookKey;

public interface RecordBookMapper {
    int deleteByPrimaryKey(RecordBookKey key);

    int insert(RecordBook record);

    int insertSelective(RecordBook record);

    RecordBook selectByPrimaryKey(RecordBookKey key);

    int updateByPrimaryKeySelective(RecordBook record);

    int updateByPrimaryKey(RecordBook record);
}