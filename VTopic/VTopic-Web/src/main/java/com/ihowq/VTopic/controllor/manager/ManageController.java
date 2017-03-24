package com.ihowq.VTopic.controllor.manager;

import com.ihowq.VTopic.controllor.WebExceptionHandler;
import com.ihowq.VTopic.model.UserInfo;
import com.ihowq.VTopic.service.cache.SessionService;
import com.ihowq.VTopic.service.cache.model.CustLoginSession;
import com.ihowq.VTopic.service.common.MvRoleService;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * 管理员入口
 *
 * @author howq
 * @create 2017-03-16 10:22
 **/
@Controller
@RequestMapping(value = "/manage")
public class ManageController extends WebExceptionHandler {

    @Resource
    private SessionService sessionService;

    @Resource
    private MvRoleService mvRoleService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public ModelAndView index(HttpServletRequest request){
        logger.info("进入管理员界面");
        ModelAndView modelAndView = new ModelAndView("common/layout");
        modelAndView = mvRoleService.MvInfoInit(request, modelAndView);
        modelAndView.addObject("curPage", 0);
        return modelAndView;
    }
}
