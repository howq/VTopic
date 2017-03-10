package com.ihowq.VTopic.dao;

import com.ihowq.VTopic.model.User;
import org.springframework.stereotype.Repository;

@Repository(value = "UserMapper")
public interface UserMapper {
    int deleteByPrimaryKey(String username);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String username);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}