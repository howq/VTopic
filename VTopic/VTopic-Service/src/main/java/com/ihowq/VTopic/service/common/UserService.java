package com.ihowq.VTopic.service.common;

import com.ihowq.VTopic.model.User;


/**
 * 用户操作Service
 *
 * @author howq
 * @create 2017/3/11 13:17
 **/
public interface UserService {

    /**
     * 查询用户
     *
     * @param username  用户名
     * @param pwd       密码
     * @return          用户信息
     * @throws Exception
     */
    User selectUser(String username, String pwd)
            throws Exception;
}
