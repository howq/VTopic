package com.ihowq.dao;

import com.ihowq.model.Category;

public interface CategoryMapper {
    int deleteByPrimaryKey(Long categoryid);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Long categoryid);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
}