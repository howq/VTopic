package com.ihowq.VTopic.service.common;

import com.ihowq.VTopic.model.User;

/**
 * Created by howq on 2017/3/11.
 */
public interface UserService {

    /**
     * 查询用户信息
     *
     * @param username  用户名
     * @param pwd       密码
     * @return          用户信息
     * @throws Exception
     */
    User selectUserInfo(String username, String pwd)
            throws Exception;
}
