package com.ihowq.dao;

import com.ihowq.model.Major;

public interface MajorMapper {
    int deleteByPrimaryKey(Long majorid);

    int insert(Major record);

    int insertSelective(Major record);

    Major selectByPrimaryKey(Long majorid);

    int updateByPrimaryKeySelective(Major record);

    int updateByPrimaryKey(Major record);
}