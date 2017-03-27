package com.ihowq.VTopic.dao;

import com.ihowq.VTopic.model.User;

/**
 * The interface User mapper.
 */
public interface UserMapper {
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
    int insert(User record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(User record);

    /**
     * Select by primary key user. 前台
     *
     * @param userid the userid
     * @return the user
     */
    User selectByPrimaryKeyFrontend(String userid);

    /**
     * 后台管理
     *
     * @param userid
     * @return
     */
    User selectByPrimaryKeyBackend(String userid);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(User record);
}