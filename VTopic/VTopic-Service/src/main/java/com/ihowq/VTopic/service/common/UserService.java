package com.ihowq.VTopic.service.common;

import com.ihowq.VTopic.model.User;
import com.ihowq.VTopic.model.UserInfo;
import org.springframework.dao.DataAccessException;

import java.util.List;


/**
 * 用户操作Service
 *
 * @author howq
 * @create 2017 /3/11 13:17
 */
public interface UserService {

    /**
     * 查询用户
     *
     * @param username 用户名
     * @param pwd      密码
     * @return 用户信息 user info
     * @throws Exception the exception
     */
    public UserInfo checkPwd(String username, String pwd)
            throws Exception;

    /**
     * 查询用户 前台
     *
     * @param username 用户名
     * @param pwd      密码
     * @return 用户信息 user info
     * @throws DataAccessException the data access exception
     */
    public UserInfo checkPwdFrontend(String username, String pwd)
            throws DataAccessException;

    /**
     * 查询用户 后台管理
     *
     * @param username 用户名
     * @param pwd      密码
     * @return 用户信息 user info
     * @throws DataAccessException the data access exception
     */
    public UserInfo checkPwdBackend(String username, String pwd)
            throws DataAccessException;

    /**
     * Gets student.
     *
     * @return the student
     * @throws DataAccessException the data access exception
     */
    public List<UserInfo> getStudent() throws DataAccessException;
}
