package com.ihowq.VTopic.controllor.common;

import com.ihowq.VTopic.controllor.WebExceptionHandler;
import com.ihowq.VTopic.model.UserInfo;
import com.ihowq.VTopic.service.cache.SessionService;
import com.ihowq.VTopic.service.cache.model.CustLoginSession;
import com.ihowq.VTopic.service.common.UserService;
import com.ihowq.VTopic.util.IPUtil;
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
import javax.servlet.http.HttpSession;

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

    @Resource(name="sessionService")
    private SessionService sessionService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public ModelAndView index() {
        logger.info("进入登陆界面");
        return new ModelAndView("common/index");
    }

    @RequestMapping(value = "/doLogin",method = RequestMethod.POST)
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "username", required = true) String username, @RequestParam(value="password",required = true) String password, @RequestParam(value = "rememberMe",required = false) String rememberMe) {
        logger.info("=======================进行登录操作=======================");
        ModelAndView modelAndView = new ModelAndView();
        logger.info("=======================获取session开始=======================");
        HttpSession session = request.getSession();
        logger.info("=======================获取session结束=======================");
        try {
            UserInfo userInfo = userService.checkPwd(username, password);
            if(null!= userInfo){
                logger.info("用户:[" + userInfo.getUsername() + "] 请求的ip地址：[" + IPUtil.getIpAddr(request) + "] 使用的浏览器版本：[" + request.getHeader("USER-AGENT") + "]");
                session.setAttribute("userInfo", userInfo);
                CustLoginSession loginSession = new CustLoginSession();
                // 保存用户信息到session中
                loginSession.setUserInfo(userInfo);
                loginSession.setSessionId(session.getId());
                logger.info("=======================创建用户session信息========================");
                sessionService.createOrUpdateLoginSession(request, response, loginSession);
                logger.info("=======================创建用户session信息结束========================");
                if(rememberMe.equals("on")){

                }
            }else {

            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }

    @ResponseBody
    @RequestMapping(value = "/result",method = RequestMethod.POST)
    public Result<Object> result(HttpServletRequest request, @RequestParam(value = "username", required = true) String username, @RequestParam(value="password",required = true) String password, @RequestParam(value = "rememberMe",required = false) String rememberMe) {
        Result<Object> result = new Result<Object>();
        try {
            logger.info(username+":"+password);

            result.setCode(Result.Code.SUCCESS);
            result.setMessage("登陆成功");
        } catch (Exception e) {
            logger.error("登陆失败", e);
            result.setCode(Result.Code.ERROR);
            result.setMessage("登陆失败");
            return result;
        }
        return result;
    }
}
