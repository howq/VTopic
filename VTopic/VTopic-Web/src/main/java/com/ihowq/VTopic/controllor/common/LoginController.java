package com.ihowq.VTopic.controllor.common;

import com.ihowq.VTopic.controllor.WebExceptionHandler;
import com.ihowq.VTopic.service.common.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 登陆入口
 *
 * @author howq
 * @create 2017/3/9 14:17
 **/
@Controller
public class LoginController extends WebExceptionHandler {

    @Resource(name="userService")
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(Model model) {
        String retVal = "user/index";
        logger.info("进入登陆界面");

        try {
            userService.selectUser("admin", "123456");
        } catch (Exception e) {
            e.printStackTrace();
        }

        logger.info("进入登陆界面结束");
        return retVal;
    }
}
