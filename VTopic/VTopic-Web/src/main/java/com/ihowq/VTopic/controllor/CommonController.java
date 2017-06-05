package com.ihowq.VTopic.controllor;

import com.alibaba.fastjson.JSON;
import com.ihowq.VTopic.dto.CommonCategory;
import com.ihowq.VTopic.dto.CommonMajor;
import com.ihowq.VTopic.dto.CommonTopic;
import com.ihowq.VTopic.model.Record;
import com.ihowq.VTopic.model.UserInfo;
import com.ihowq.VTopic.service.common.*;
import com.ihowq.VTopic.util.PageBean;
import com.ihowq.VTopic.util.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

/**
 * The type Common controller.
 *
 * @author howq
 * @create 2017 -05-23 20:46
 */
@RequestMapping(value = "/common")
@Controller
public class CommonController extends WebExceptionHandler {

    @Resource
    private CategoryService categoryService;

    @Resource
    private MajorService majorService;

    @Resource
    private TopicService topicService;

    @Resource
    private RecordService recordService;

    @Resource
    private UserService userService;

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
            PageBean<CommonTopic> data = topicService.getTopics(commonTopic, startPage, pageSize, request);
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
     * Category string.
     *
     * @return the string
     */
    @RequestMapping(value = "/category", method = RequestMethod.GET)
    @ResponseBody
    public String category() {
        logger.info("=========获取类别列表==============");
        Result<Object> result = new Result<Object>();
        HashMap hashMap = new HashMap();
        List<CommonCategory> data = null;
        try {
            data = categoryService.getCategories();
            hashMap.put("total", data.size());
            hashMap.put("rows", data);
        } catch (Exception e) {
            logger.error("=========获取类别列表失败:" + e.getMessage() + "==============");
            result.setCode(Result.Code.ERROR);
            return JSON.toJSONString(data);
        }
        logger.info("=========获取类别列表成功==============");
        result.setCode(Result.Code.SUCCESS);
        return JSON.toJSONString(data);
    }


    /**
     * Major string.
     *
     * @return the string
     */
    @RequestMapping(value = "/major", method = RequestMethod.GET)
    @ResponseBody
    public String major() {
        logger.info("=========获取专业列表==============");
        Result<Object> result = new Result<Object>();
        HashMap hashMap = new HashMap();
        List<CommonMajor> data = null;
        try {
            data = majorService.getMajors();
            hashMap.put("total", data.size());
            hashMap.put("rows", data);
        } catch (Exception e) {
            logger.error("=========获取专业列表失败:" + e.getMessage() + "==============");
            result.setCode(Result.Code.ERROR);
            return JSON.toJSONString(data);
        }
        logger.info("=========获取专业列表成功==============");
        result.setCode(Result.Code.SUCCESS);
        return JSON.toJSONString(data);
    }

    @RequestMapping(value = "/selectTopic", method = RequestMethod.POST)
    @ResponseBody
    public Result<Object> selectTopic(Record record, @RequestParam(value = "isUpdate", required = true) boolean isUpdate, HttpServletRequest request) {

        logger.info("=========选择题目开始==============");
        Result<Object> result = new Result<Object>();
        try {
            recordService.saveOrUpdateRecord(record, isUpdate, request);
//            topicService.delTopic(topicId, request);
        } catch (Exception e) {
            logger.error("=========选择题目失败:" + e.getMessage() + "==============");
            result.setCode(Result.Code.ERROR);
            return result;
        }
        logger.info("=========选择题目成功==============");
        result.setCode(Result.Code.SUCCESS);
        return result;
    }

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    @ResponseBody
    public String student() {
        logger.info("=========获取学生列表==============");
        Result<Object> result = new Result<Object>();
        HashMap hashMap = new HashMap();
        List<UserInfo> data = null;
        try {
            data = userService.getStudent();
            hashMap.put("total", data.size());
            hashMap.put("rows", data);
        } catch (Exception e) {
            logger.error("=========获取学生列表失败:" + e.getMessage() + "==============");
            result.setCode(Result.Code.ERROR);
            return JSON.toJSONString(data);
        }
        logger.info("=========获取学生列表成功==============");
        result.setCode(Result.Code.SUCCESS);
        return JSON.toJSONString(data);
    }
}
