package com.ihowq.VTopic.dao;

import com.ihowq.VTopic.model.UserInfo;

/**
 * The interface User info mapper.
 */
public interface UserInfoMapper {
    /**
     * Delete by primary key int.
     *
     * @param userid the userid
     * @return the int
     */
    int deleteByPrimaryKey(String userid);

    /**
     * Insert int.
     *
     * @param record the record
     * @return the int
     */
    int insert(UserInfo record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(UserInfo record);

    /**
     * Select by primary key user info.
     *
     * @param userid the userid
     * @return the user info
     */
    UserInfo selectByPrimaryKey(String userid);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(UserInfo record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(UserInfo record);
}