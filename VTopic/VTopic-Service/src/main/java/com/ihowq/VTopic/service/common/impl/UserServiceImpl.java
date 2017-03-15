package com.ihowq.VTopic.service.common.impl;

import com.ihowq.VTopic.dao.UserMapper;
import com.ihowq.VTopic.model.User;
import com.ihowq.VTopic.service.common.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 用户操作
 *
 * @author howq
 * @create 2017/3/11 14:17
 **/
@Service(value="userService")
public class UserServiceImpl implements UserService {

    @Resource(name="userMapper")
    private UserMapper userMapper;

    @Override
    public User selectUser(String username, String pwd) throws Exception {

        User user = userMapper.selectByPrimaryKey(username);
        if(pwd.equals(user.getPassword())){
            return user;
        }
        return null;
    }
}
