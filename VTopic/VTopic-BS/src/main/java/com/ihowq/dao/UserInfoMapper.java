package com.ihowq.dao;

import com.ihowq.model.UserInfo;

public interface UserInfoMapper {
    int deleteByPrimaryKey(String userid);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}