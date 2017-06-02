package com.ihowq.VTopic.controllor.teacher;

import com.alibaba.fastjson.JSON;
import com.ihowq.VTopic.controllor.WebExceptionHandler;
import com.ihowq.VTopic.dto.CommonRecordBook;
import com.ihowq.VTopic.dto.CommonTopic;
import com.ihowq.VTopic.model.Topic;
import com.ihowq.VTopic.service.VTConfig;
import com.ihowq.VTopic.service.common.MvRoleService;
import com.ihowq.VTopic.service.common.TopicService;
import com.ihowq.VTopic.util.PageBean;
import com.ihowq.VTopic.util.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

/**
 * The type Teacher controller.
 *
 * @author howq
 * @create 2017 -03-16 11:08
 */
@RequestMapping(value = "/teacher")
@Controller
public class TeacherController extends WebExceptionHandler {

    @Resource
    private MvRoleService mvRoleService;

    @Resource
    private TopicService topicService;

    @Resource
    private VTConfig vtConfig;

    /**
     * Index model and view.
     *
     * @param request the request
     * @return the model and view
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView index(HttpServletRequest request) {
        logger.info("进入教师管理界面");
        ModelAndView modelAndView = new ModelAndView("common/layout");
        modelAndView = mvRoleService.MvInfoInit(request, modelAndView);
        modelAndView.addObject("curPage", 1);
        modelAndView.addObject("logout", "http://" + vtConfig.getLoginHost() + ":" + vtConfig.getLoginPort() + "/" + vtConfig.getLoginProjectName() + "/logout");
        return modelAndView;
    }

    /**
     * Topic result.
     *
     * @param request   the request
     * @param startPage the start page
     * @param pageSize  the page size
     * @return the result
     */
    @RequestMapping(value = "/topic", method = RequestMethod.GET)
    @ResponseBody
    public String topic(HttpServletRequest request,
            CommonTopic commonTopic,
            @RequestParam(value = "page", required = true) int startPage,
            @RequestParam(value = "rows", required = true) int pageSize) {
        logger.info("=========获取课题列表==============");
        Result<Object> result = new Result<Object>();
        HashMap hashMap = new HashMap();
        try {
            PageBean<CommonTopic> data = topicService.getTopics(commonTopic,startPage, pageSize, request);
            hashMap.put("total", data.getTotal());
            hashMap.put("rows", data.getList());
        } catch (Exception e) {
            logger.error("=========获取课题列表失败:" + e.getMessage() + "==============");
            result.setCode(Result.Code.ERROR);
            return JSON.toJSONString(hashMap);
        }
        logger.info("=========获取课题列表成功==============");
        result.setCode(Result.Code.SUCCESS);
        return JSON.toJSONString(hashMap);
    }

    /**
     * Del topic result.
     *
     * @param topicId the topic id
     * @param request the request
     * @return the result
     */
    @RequestMapping(value = "/delTopic", method = RequestMethod.POST)
    @ResponseBody
    public Result<Object> delTopic(@RequestParam(value = "topicId", required = true) Long topicId, HttpServletRequest request) {
        logger.info("=========删除题目开始==============");
        Result<Object> result = new Result<Object>();
        try {
            topicService.delTopic(topicId, request);
        } catch (Exception e) {
            logger.error("=========删除题目失败:" + e.getMessage() + "==============");
            result.setCode(Result.Code.ERROR);
            return result;
        }
        logger.info("=========删除题目成功==============");
        result.setCode(Result.Code.SUCCESS);
        return result;
    }

    /**
     * Change topic result.
     *
     * @param topic    the topic
     * @param isUpdate the is update
     * @param request  the request
     * @return the result
     */
    @RequestMapping(value = "/changeTopic", method = RequestMethod.POST)
    @ResponseBody
    public Result<Object> changeTopic(Topic topic, @RequestParam(value = "isUpdate", required = true) boolean isUpdate, HttpServletRequest request) {
        logger.info("=========更改或新增changeTopic记录==============");
        Result<Object> result = new Result<Object>();
        try {
            topicService.saveOrUpdateTopic(topic, isUpdate, request);
        } catch (Exception e) {
            logger.error("=========更改或新增changeTopic记录失败:" + e.getMessage() + "==============");
            result.setCode(Result.Code.ERROR);
            return result;
        }
        logger.info("=========更改或新增changeTopic记录成功==============");
        result.setCode(Result.Code.SUCCESS);
        return result;
    }
}
