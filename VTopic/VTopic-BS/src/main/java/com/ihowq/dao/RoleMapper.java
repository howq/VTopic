package com.ihowq.dao;

import com.ihowq.model.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(Byte roleid);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Byte roleid);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}