package com.ihowq.VTopic.controllor.student;

import com.ihowq.VTopic.controllor.WebExceptionHandler;
import com.ihowq.VTopic.model.UserInfo;
import com.ihowq.VTopic.service.VTConfig;
import com.ihowq.VTopic.service.cache.SessionService;
import com.ihowq.VTopic.service.cache.model.CustLoginSession;
import com.ihowq.VTopic.service.common.MvRoleService;
import com.ihowq.VTopic.service.common.RecordBookService;
import com.ihowq.VTopic.util.Result;
import com.ihowq.VTopic.util.common.VTopicConst;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author howq
 * @create 2017-03-16 11:08
 **/
@RequestMapping(value = "student")
@Controller
public class StudentController extends WebExceptionHandler{

    @Resource
    private MvRoleService mvRoleService;

    @Resource
    private VTConfig vtConfig;

    @Resource
    private SessionService sessionService;

    @Resource
    private RecordBookService recordBookService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public ModelAndView index(HttpServletRequest request){
        logger.info("进入学生选题界面");
        CustLoginSession loginSession = null;
        ModelAndView modelAndView = new ModelAndView("common/layout");
        try {
            loginSession = sessionService.getSession(request);
            if (recordBookService.isOpenSelect()){
                modelAndView.addObject("openstatus", VTopicConst.OPEN_STATUS_1);
            }else {
                modelAndView.addObject("openstatus", VTopicConst.OPEN_STATUS_0);
            }
        } catch (Exception e) {
            logger.error("=========获取用户Session失败" + e.getMessage() + "==============");
        }
        UserInfo userInfo = loginSession.getUserInfo();
        modelAndView = mvRoleService.MvInfoInit(request, modelAndView);
        modelAndView.addObject("curPage", 2);
        modelAndView.addObject("role", userInfo.getRoleid());
        modelAndView.addObject("logout", "http://"+vtConfig.getLoginHost()+":"+vtConfig.getLoginPort()+"/"+vtConfig.getLoginProjectName()+"/logout");

        return modelAndView;
    }
}
