package com.ihowq.VTopic.dao;

import com.ihowq.VTopic.model.Role;
import org.springframework.stereotype.Repository;

@Repository(value = "RoleMapper")
public interface RoleMapper {
    int deleteByPrimaryKey(Byte roleid);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Byte roleid);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}