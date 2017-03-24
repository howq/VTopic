package com.ihowq.VTopic.service.common;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 前端页面角色权限显示控制
 *
 * @author howq
 * @create 2017-03-24 10:21
 **/
public interface MvRoleService {

    public ModelAndView MvInfoInit(HttpServletRequest request, ModelAndView modelAndView);
}
