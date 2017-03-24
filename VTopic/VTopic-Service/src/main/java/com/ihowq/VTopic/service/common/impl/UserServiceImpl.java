package com.ihowq.VTopic.service.common.impl;

import com.ihowq.VTopic.dao.UserInfoMapper;
import com.ihowq.VTopic.dao.UserMapper;
import com.ihowq.VTopic.model.User;
import com.ihowq.VTopic.model.UserInfo;
import com.ihowq.VTopic.service.common.UserService;
import com.ihowq.VTopic.service.common.VTopicServiceBase;
import com.ihowq.VTopic.util.Md5CryptDigest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 用户操作
 *
 * @author howq
 * @create 2017/3/11 14:17
 **/
@Service(value = "userService")
public class UserServiceImpl extends VTopicServiceBase implements UserService {

    @Resource(name = "userMapper")
    private UserMapper userMapper;

    @Resource(name = "userInfoMapper")
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo checkPwd(String userid, String pwd) throws Exception {
        User user = userMapper.selectByPrimaryKey(userid);
        String password = Md5CryptDigest.encodeMd5(user.getPassword());
        if (pwd.equals(password)) {
            logger.info("校验用户密码成功！");
            return userInfoMapper.selectByPrimaryKey(userid);
        }
        return null;
    }
}
