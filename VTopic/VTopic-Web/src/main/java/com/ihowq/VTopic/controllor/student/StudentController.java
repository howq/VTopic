package com.ihowq.VTopic.controllor.student;

import com.ihowq.VTopic.controllor.WebExceptionHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author howq
 * @create 2017-03-16 11:08
 **/
@RequestMapping(value = "student")
@Controller
public class StudentController extends WebExceptionHandler{

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public ModelAndView index() {
        logger.info("进入学生选题界面");
        return new ModelAndView("student/student");
    }
}