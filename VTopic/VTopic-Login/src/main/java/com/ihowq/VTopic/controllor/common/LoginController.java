package com.ihowq.VTopic.controllor.common;

import com.ihowq.VTopic.controllor.WebExceptionHandler;
import com.ihowq.VTopic.model.UserInfo;
import com.ihowq.VTopic.service.VTConfig;
import com.ihowq.VTopic.service.cache.SessionService;
import com.ihowq.VTopic.service.cache.model.CustLoginSession;
import com.ihowq.VTopic.service.common.UserService;
import com.ihowq.VTopic.util.IPUtil;
import com.ihowq.VTopic.util.Result;
import com.ihowq.VTopic.util.ValidateUtil;
import com.ihowq.VTopic.util.common.VTopicConst;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * 登陆入口
 *
 * @author howq
 * @create 2017 /3/9 14:17
 */
@Controller
public class LoginController extends WebExceptionHandler {

    @Resource(name = "userService")
    private UserService userService;

    @Resource(name = "sessionService")
    private SessionService sessionService;

    @Resource
    private VTConfig vtConfig;
    /**
     * Index string.
     *
     * @param request the request
     * @return the string
     * @throws Exception the exception
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(HttpServletRequest request) throws java.lang.Exception {
        logger.info("进入登陆界面");
        CustLoginSession loginSession = sessionService.getSession(request);
        if (null != loginSession) {
            return "redirect:" + loginSession.getUrl();
        }
        return "index";
    }

    /**
     * Login result.
     *
     * @param request    the request
     * @param response   the response
     * @param username   the username
     * @param password   the password
     * @param rememberMe the remember me
     * @return the result
     */
    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    @ResponseBody
    public Result<Object> login(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "username", required = true) String username, @RequestParam(value = "password", required = true) String password, @RequestParam(value = "rememberMe", required = false) String rememberMe) {
        logger.info("=======================进行登录操作=======================");
        Result<Object> result = new Result<Object>();
        // 输入项目检查
        if (!chkInputInfo(username, password)) {
            result.setCode(Result.Code.ERROR);
            result.setMessage("登陆失败");
            logger.info("登录输入格式错误");
            return result;
        }
        try {
            UserInfo userInfo = userService.checkPwd(username, password);
            if (null != userInfo) {
                logger.info("=======================获取session开始=======================");
                HttpSession session = request.getSession();
                logger.info("=======================获取session结束=======================");
                StringBuilder url = new StringBuilder();
                //用户角色判断
                if (VTopicConst.ROLE_MANAGER_CODE == userInfo.getRoleid()) {
                    url = url.append("http://").append(vtConfig.getBackendHost()).append(":")
                            .append(vtConfig.getBackendPort()).append("/")
                            .append(vtConfig.getBackendProjectName())
                            .append("/manage/index");
                } else if (VTopicConst.ROLE_TEACHER_CODE == userInfo.getRoleid()) {
                    url = url.append("http://").append(vtConfig.getFrontendHost()).append(":")
                            .append(vtConfig.getFrontendPort()).append("/")
                            .append(vtConfig.getFrontendProjectName())
                            .append("/teacher/index");
                } else if (VTopicConst.ROLE_STUDENT_CODE == userInfo.getRoleid()) {
                    url = url.append("http://").append(vtConfig.getFrontendHost()).append(":")
                            .append(vtConfig.getFrontendPort()).append("/")
                            .append(vtConfig.getFrontendProjectName())
                            .append("/student/index");
                }
                CustLoginSession loginSession = new CustLoginSession();
                Map<String, Object> resultMap = new HashMap<String, Object>();
                loginSession.setUrl(url.toString());
                resultMap.put("url", url.toString());
                logger.info("用户:[" + userInfo.getUsername() + "] 请求的ip地址：[" + IPUtil.getIpAddr(request) + "] 使用的浏览器版本：[" + request.getHeader("USER-AGENT") + "]");
                session.setAttribute("userInfo", userInfo);
                // 保存用户信息到session中
                loginSession.setUserInfo(userInfo);
                loginSession.setSessionId(session.getId());
                logger.info("=======================创建用户session信息========================");
                sessionService.createOrUpdateLoginSession(request, response, loginSession, rememberMe);
                logger.info("=========创建用户session信息结束========="+username + ":" +"登录成功");
                result.setData(resultMap);
                result.setCode(Result.Code.SUCCESS);
                result.setMessage("登陆成功");
                return result;
            }else{
                logger.info("登陆失败，密码或账号错误----->密码错误");
                result.setCode(Result.Code.ERROR);
                result.setMessage("登陆失败");
                return result;
            }
        } catch (Exception e) {
            logger.error("登陆失败，密码或账号错误----->账号未注册" + e.getMessage());
            result.setCode(Result.Code.ERROR);
            result.setMessage("登陆失败");
            return result;
        }
    }

    /**
     * 其它页面返回Login页面处理
     *
     * @param request  the request
     * @param response the response
     * @return INPUT :成功
     */
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpServletRequest request, HttpServletResponse response) {
        try {
            HttpSession session = request.getSession();
            session.removeAttribute("userInfo");
            sessionService.removeSession(request, response);
        } catch (Exception e) {
            logger.error("返回登录界面出错", e.getMessage());
        }
        return "redirect:/index";
    }

    /**
     * Result result.
     *
     * @param request    the request
     * @param username   the username
     * @param password   the password
     * @param rememberMe the remember me
     * @return the result
     */
    @ResponseBody
    @RequestMapping(value = "/result", method = RequestMethod.POST)
    public Result<Object> result(HttpServletRequest request, @RequestParam(value = "username", required = true) String username, @RequestParam(value = "password", required = true) String password, @RequestParam(value = "rememberMe", required = false) String rememberMe) {
        Result<Object> result = new Result<Object>();
        try {
            logger.info(username + ":" + password);

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

    /**
     * 输入项目检查
     *
     * @return true：合法、false：非法
     * @throws Exception
     */
    private boolean chkInputInfo(String username, String password) {
        // 用户登录名为空检查
        if (StringUtils.isEmpty(username)) {
            return false;
        } else {
            // 用户登录名是半角英、数字检查
            if (ValidateUtil.chkEnNum(username) == false) {
                return false;
            }
            // 用户登录名长度不足检查
            if (ValidateUtil.chkItemLength(username, 5, 18) == false) {
                return false;
            }
            // 用户登录密码为空检查
            if (null == password || "".equals(password.trim())) {
                return false;
            }
//            // 用户登录密码是半角英、数字检查
//            if (ValidateUtil.chkEnNum(password) == false) {
//                return false;
//            }
//            // 用户登录密码长度不足检查
//            if (ValidateUtil.chkItemLength(password, 6, 12) == false) {
//                return false;
//            }
        }
        return true;
    }
}
