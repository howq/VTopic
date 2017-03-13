package com.ihowq.VTopic.dao;

import com.ihowq.VTopic.model.Major;
import org.springframework.stereotype.Repository;

public interface MajorMapper {
    int deleteByPrimaryKey(Long majorid);

    int insert(Major record);

    int insertSelective(Major record);

    Major selectByPrimaryKey(Long majorid);

    int updateByPrimaryKeySelective(Major record);

    int updateByPrimaryKey(Major record);
}