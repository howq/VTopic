package com.ihowq.VTopic.dao;

import com.ihowq.VTopic.model.Category;
import org.springframework.stereotype.Repository;

@Repository(value = "CategoryMapper")
public interface CategoryMapper {
    int deleteByPrimaryKey(Long categoryid);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Long categoryid);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
}