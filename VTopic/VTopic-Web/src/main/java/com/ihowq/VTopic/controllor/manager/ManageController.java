package com.ihowq.VTopic.controllor.manager;

import com.ihowq.VTopic.controllor.WebExceptionHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 管理员入口
 *
 * @author howq
 * @create 2017-03-16 10:22
 **/
@Controller
@RequestMapping(value = "/manage")
public class ManageController extends WebExceptionHandler {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public ModelAndView index() {
        logger.info("进入管理员界面");
        return new ModelAndView("manager/manager");
    }
}
