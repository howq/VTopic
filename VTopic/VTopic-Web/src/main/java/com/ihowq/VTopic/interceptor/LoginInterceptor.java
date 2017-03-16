package com.ihowq.VTopic.interceptor;

import com.ihowq.VTopic.service.cache.SessionService;
import com.ihowq.VTopic.service.cache.model.CustLoginSession;
import com.ihowq.VTopic.util.common.VTopicConst;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登陆拦截器
 *
 * @author howq
 * @create 2017/3/9 14:17
 **/
public class LoginInterceptor implements HandlerInterceptor {


    private static final Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);

    @Resource
    private SessionService sessionService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.debug("request path：" + request.getRequestURI());
        try {
            CustLoginSession loginSession = sessionService.getSession(request);
            String uri = request.getRequestURI();
            logger.debug("request path：" + uri);
            if (loginSession == null) {
                response.sendRedirect(request.getContextPath() + "/index");
                return false;
            }
        } catch (Exception e) {
            response.sendRedirect(request.getContextPath() + "/index");
            return false;
        }
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object o, Exception arg3) throws Exception {


    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse arg1, Object arg2, ModelAndView arg3) throws Exception {

    }
}
