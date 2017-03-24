package com.ihowq.VTopic.controllor.teacher;

import com.ihowq.VTopic.controllor.WebExceptionHandler;
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
@RequestMapping(value = "/teacher")
@Controller
public class TeacherController extends WebExceptionHandler{

    @Resource
    private MvRoleService mvRoleService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public ModelAndView index(HttpServletRequest request){
        logger.info("进入教师管理界面");
        ModelAndView modelAndView = new ModelAndView("common/layout");
        modelAndView = mvRoleService.MvInfoInit(request, modelAndView);
        modelAndView.addObject("curPage", 1);
        return modelAndView;
    }
}
