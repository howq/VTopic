package com.ihowq.VTopic.controllor.teacher;

import com.ihowq.VTopic.controllor.WebExceptionHandler;
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

    @RequestMapping(value = "/record", method = RequestMethod.GET)
    @ResponseBody
    public Result<Object> record(@RequestParam(value = "startPage", required = true) int startPage, @RequestParam(value = "pageSize", required = true) int pageSize) {
        logger.info("=========获取选课记录==============");
        Result<Object> result = new Result<Object>();
        try {
//            result.setData(manageService.getRecordBooks(startPage, pageSize));
        }catch (Exception e){
            logger.error("=========获取选课记录失败:"+e.getMessage()+"==============");
            result.setCode(Result.Code.ERROR);
            return result;
        }
        logger.info("=========获取选课记录成功==============");
        result.setCode(Result.Code.SUCCESS);
        return result;
    }
}
