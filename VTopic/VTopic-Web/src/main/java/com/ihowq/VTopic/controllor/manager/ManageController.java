package com.ihowq.VTopic.controllor.manager;

import com.ihowq.VTopic.controllor.WebExceptionHandler;
import com.ihowq.VTopic.service.cache.SessionService;
import com.ihowq.VTopic.service.common.MvRoleService;
import com.ihowq.VTopic.util.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView index(HttpServletRequest request) {
        logger.info("进入管理员界面");
        ModelAndView modelAndView = new ModelAndView("common/layout");
        modelAndView = mvRoleService.MvInfoInit(request, modelAndView);
        modelAndView.addObject("curPage", 0);
        return modelAndView;
    }

    @RequestMapping(value = "/recordBook", method = RequestMethod.POST)
    @ResponseBody
    public Result<Object> recordBook(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "username", required = true) String username, @RequestParam(value = "password", required = true) String password, @RequestParam(value = "rememberMe", required = false) String rememberMe) {
        logger.info("=========获取RecordBook记录==============");
        Result<Object> result = new Result<Object>();



        logger.error("登陆失败，密码或账号错误----->账号未注册");
        result.setCode(Result.Code.ERROR);
        result.setMessage("登陆失败");
        return result;
    }
}
