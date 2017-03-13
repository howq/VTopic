package com.ihowq.VTopic.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by howq on 2017/3/9.
 */
public class LoginInterceptor implements HandlerInterceptor {


    private static final Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.debug("request path：" + request.getRequestURI());

        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object o, Exception arg3) throws Exception {


    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse arg1, Object arg2, ModelAndView arg3) throws Exception {

    }
}
