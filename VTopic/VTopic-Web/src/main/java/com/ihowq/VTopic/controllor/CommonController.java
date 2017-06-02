package com.ihowq.VTopic.controllor;

import com.alibaba.fastjson.JSON;
import com.ihowq.VTopic.dto.CommonCategory;
import com.ihowq.VTopic.dto.CommonMajor;
import com.ihowq.VTopic.service.common.CategoryService;
import com.ihowq.VTopic.service.common.MajorService;
import com.ihowq.VTopic.util.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
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
}
