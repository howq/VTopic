package com.ihowq.VTopic.dao;

import com.ihowq.VTopic.model.Role;

/**
 * The interface Role mapper.
 */
public interface RoleMapper {
    /**
     * Delete by primary key int.
     *
     * @param roleid the roleid
     * @return the int
     */
    int deleteByPrimaryKey(Byte roleid);

    /**
     * Insert int.
     *
     * @param record the record
     * @return the int
     */
    int insert(Role record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(Role record);

    /**
     * Select by primary key role.
     *
     * @param roleid the roleid
     * @return the role
     */
    Role selectByPrimaryKey(Byte roleid);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(Role record);
}