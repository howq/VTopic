package com.ihowq.VTopic.service.common.impl;

import com.ihowq.VTopic.model.UserInfo;
import com.ihowq.VTopic.service.cache.model.CustLoginSession;
import com.ihowq.VTopic.service.common.MvRoleService;
import com.ihowq.VTopic.service.VTopicServiceBase;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author howq
 * @create 2017-03-24 10:24
 **/
@Service(value = "mvRoleService")
public class MvRoleServiceImpl extends VTopicServiceBase implements MvRoleService {

    @Override
    public ModelAndView MvInfoInit(HttpServletRequest request, ModelAndView modelAndView) {
        CustLoginSession loginSession = null;
        try {
            loginSession = sessionService.getSession(request);
        } catch (Exception e) {
            logger.error("获取Session失败！");
        }
        UserInfo userInfo = loginSession.getUserInfo();
        modelAndView.addObject("userInfo", userInfo);
        return modelAndView;
    }
}
