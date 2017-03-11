package com.ihowq.VTopic.controllor;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by howq on 2017/3/11.
 */
@Controller
@RequestMapping("/error")
public class ErrorController extends WebExceptionHandler {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @RequestMapping(value = "/404", method = RequestMethod.GET)
    public Object notFund() throws Exception {
        return "error/Error";
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @RequestMapping(value = "/500", method = RequestMethod.GET)
    public Object errorServer() throws Exception {
        return "error/Error";
    }
}
