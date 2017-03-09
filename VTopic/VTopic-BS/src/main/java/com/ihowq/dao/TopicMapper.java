package com.ihowq.dao;

import com.ihowq.model.Topic;

public interface TopicMapper {
    int deleteByPrimaryKey(Long topicid);

    int insert(Topic record);

    int insertSelective(Topic record);

    Topic selectByPrimaryKey(Long topicid);

    int updateByPrimaryKeySelective(Topic record);

    int updateByPrimaryKey(Topic record);
}