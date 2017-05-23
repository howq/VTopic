package com.ihowq.VTopic.controllor.manager;

import com.alibaba.fastjson.JSON;
import com.ihowq.VTopic.controllor.WebExceptionHandler;
import com.ihowq.VTopic.dto.CommonRecordBook;
import com.ihowq.VTopic.model.RecordBook;
import com.ihowq.VTopic.service.VTConfig;
import com.ihowq.VTopic.service.cache.SessionService;
import com.ihowq.VTopic.service.common.MvRoleService;
import com.ihowq.VTopic.service.common.RecordBookService;
import com.ihowq.VTopic.util.DateUtil;
import com.ihowq.VTopic.util.PageBean;
import com.ihowq.VTopic.util.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * 管理员入口
 *
 * @author howq
 * @create 2017 -03-16 10:22
 */
@Controller
@RequestMapping(value = "/manage")
public class ManageController extends WebExceptionHandler {

    @Resource
    private SessionService sessionService;

    @Resource
    private MvRoleService mvRoleService;

    @Resource
    private RecordBookService recordBookService;

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
        logger.info("进入管理员界面");
        ModelAndView modelAndView = new ModelAndView("common/layout");
        modelAndView = mvRoleService.MvInfoInit(request, modelAndView);
        modelAndView.addObject("curPage", 0);
        modelAndView.addObject("logout", "http://" + vtConfig.getLoginHost() + ":" + vtConfig.getLoginPort() + "/" + vtConfig.getLoginProjectName() + "/logout");
        return modelAndView;
    }

    /**
     * RecordService book result.
     *
     * @param startPage the start page
     * @param pageSize  the page size
     * @return the result
     */
    @RequestMapping(value = "/recordBook", method = RequestMethod.GET)
    @ResponseBody
    public String recordBook(@RequestParam(value = "page", required = true) int startPage, @RequestParam(value = "rows", required = true) int pageSize) {
        logger.info("=========获取RecordBook记录==============");
        Result<Object> result = new Result<Object>();
        HashMap hashMap = new HashMap();
        try {
            PageBean<CommonRecordBook> data = recordBookService.getRecordBooks(startPage, pageSize);
            hashMap.put("total", data.getTotal());
            hashMap.put("rows", data.getList());
//            result.setData(recordBookService.getRecordBooks(startPage, pageSize));
        } catch (Exception e) {
            logger.error("=========获取RecordBook记录失败:" + e.getMessage() + "==============");
            result.setCode(Result.Code.ERROR);
            return JSON.toJSONString(hashMap);
        }
        logger.info("=========获取RecordBook记录成功==============");
        result.setCode(Result.Code.SUCCESS);
        return JSON.toJSONString(hashMap);
    }


    /**
     * Del record book result.
     *
     * @param recordBookId the record book id
     * @param request      the request
     * @return the result
     */
    @RequestMapping(value = "/delRecordBook", method = RequestMethod.POST)
    @ResponseBody
    public Result<Object> delRecordBook(@RequestParam(value = "recordBookId", required = true) Long recordBookId, HttpServletRequest request) {
        logger.info("=========删除RecordBook记录==============");
        Result<Object> result = new Result<Object>();
        try {
            recordBookService.delRecodBook(recordBookId, request);
        } catch (Exception e) {
            logger.error("=========删除RecordBook记录失败:" + e.getMessage() + "==============");
            result.setCode(Result.Code.ERROR);
            return result;
        }
        logger.info("=========删除RecordBook记录成功==============");
        result.setCode(Result.Code.SUCCESS);
        return result;
    }

    /**
     * Change record book result.
     *
     * @param vyear     the vyear
     * @param starttime the starttime
     * @param endtime   the endtime
     * @param isUpdate  the is update
     * @param request   the request
     * @return the result
     */
    @RequestMapping(value = "/changeRecordBook", method = RequestMethod.POST)
    @ResponseBody
    public Result<Object> changeRecordBook(@RequestParam(value = "recordbookid", required = false) Long recordbookid,@RequestParam(value = "vyear", required = true) String vyear,@RequestParam(value = "starttime", required = true) String starttime, @RequestParam(value = "endtime", required = true) String endtime, @RequestParam(value = "isUpdate", required = true) boolean isUpdate, HttpServletRequest request) {
        logger.info("=========更改或新增RecordBook记录==============");
        Result<Object> result = new Result<Object>();
        try {
            RecordBook recordBook = new RecordBook();
            recordBook.setRecordbookid(recordbookid);
            recordBook.setVyear(vyear);
            recordBook.setStarttime(DateUtil.toDate(starttime,"yyyy-MM-dd"));
            recordBook.setEndtime(DateUtil.toDate(endtime,"yyyy-MM-dd"));
            recordBookService.saveOrUpdateRecodBook(recordBook, isUpdate, request);
        } catch (Exception e) {
            logger.error("=========更改或新增RecordBook记录失败:" + e.getMessage() + "==============");
            result.setCode(Result.Code.ERROR);
            return result;
        }
        logger.info("=========更改或新增RecordBook记录成功==============");
        result.setCode(Result.Code.SUCCESS);
        return result;
    }
}
