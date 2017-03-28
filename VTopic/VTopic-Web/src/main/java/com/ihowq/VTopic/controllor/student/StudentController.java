package com.ihowq.VTopic.controllor.student;

import com.ihowq.VTopic.controllor.WebExceptionHandler;
import com.ihowq.VTopic.service.VTConfig;
import com.ihowq.VTopic.service.common.MvRoleService;
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

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public ModelAndView index(HttpServletRequest request){
        logger.info("进入学生选题界面");
        ModelAndView modelAndView = new ModelAndView("common/layout");
        modelAndView = mvRoleService.MvInfoInit(request, modelAndView);
        modelAndView.addObject("curPage", 2);
        modelAndView.addObject("logout", "http://"+vtConfig.getLoginHost()+":"+vtConfig.getLoginPort()+"/"+vtConfig.getLoginProjectName()+"/logout");

        return modelAndView;
    }
}
