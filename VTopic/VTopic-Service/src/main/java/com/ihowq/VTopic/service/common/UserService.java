package com.ihowq.VTopic.service.common;

import com.ihowq.VTopic.model.UserInfo;
import org.springframework.dao.DataAccessException;


/**
 * 用户操作Service
 *
 * @author howq
 * @create 2017/3/11 13:17
 **/
public interface UserService {

    /**
     * 查询用户 前台
     *
     * @param username 用户名
     * @param pwd      密码
     * @return 用户信息
     * @throws DataAccessException
     */
    public UserInfo checkPwdFrontend(String username, String pwd)
            throws DataAccessException;

    /**
     * 查询用户 后台管理
     *
     * @param username 用户名
     * @param pwd      密码
     * @return 用户信息
     * @throws DataAccessException
     */
    public UserInfo checkPwdBackend(String username, String pwd)
            throws DataAccessException;
}
