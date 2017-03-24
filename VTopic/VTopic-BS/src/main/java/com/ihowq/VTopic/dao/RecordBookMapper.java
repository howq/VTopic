package com.ihowq.VTopic.dao;

import com.ihowq.VTopic.model.RecordBook;

public interface RecordBookMapper {
    int deleteByPrimaryKey(Long recordbookid);

    int insert(RecordBook record);

    int insertSelective(RecordBook record);

    RecordBook selectByPrimaryKey(Long recordbookid);

    int updateByPrimaryKeySelective(RecordBook record);

    int updateByPrimaryKey(RecordBook record);
}