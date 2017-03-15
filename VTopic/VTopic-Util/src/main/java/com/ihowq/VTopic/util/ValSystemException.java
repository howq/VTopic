package com.ihowq.VTopic.util;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Properties;

/**
 * 项目自定义的异常类
 * 按照构造时的错误ID取得错误信息
 *
 * @author howq
 * @create 2017-03-16 0:24
 **/
public class ValSystemException extends RuntimeException {

    private static final long serialVersionUID = 6347074999361307437L;

    private String message;
    private String messageCode;

    /**
     * 异常类构造器
     *
     * @param messageCode 错误ID
     */
    public ValSystemException(String messageCode) {
        this(messageCode, new Object[]{});
    }

    /**
     * 异常类构造器
     *
     * @param messageCode 错误ID
     * @param args        错误信息的参数
     */
    public ValSystemException(String messageCode, Object... args) {
        super(messageCode);
        try {
            this.messageCode = messageCode;
            Resource resource = new ClassPathResource("/messages.properties");
            Properties props = PropertiesLoaderUtils.loadProperties(resource);
            this.message = MessageFormat.format(
                    props.getProperty(messageCode),
                    args);
        } catch (IOException e) {
            //do nothing
        }
    }

    /**
     * 异常类构造器
     *
     * @param messageCode 错误ID
     * @param cause       嵌套的异常
     */
    public ValSystemException(String messageCode, Throwable cause) {
        this(messageCode, cause, new Object[]{});
    }

    /**
     * 异常类构造器
     *
     * @param messageCode 错误ID
     * @param cause       嵌套的异常
     * @param args        错误信息的参数
     */
    public ValSystemException(String messageCode, Throwable cause, Object... args) {
        super(messageCode, cause);
        try {
            this.messageCode = messageCode;
            Resource resource = new ClassPathResource("/messages.properties");
            Properties props = PropertiesLoaderUtils.loadProperties(resource);
            this.message = MessageFormat.format(
                    props.getProperty(messageCode),
                    args);
        } catch (IOException e) {
            //do nothing
        }
    }

    /*
     * @see java.lang.Throwable#getMessage()
     */
    @Override
    public String getMessage() {
        return this.message;
    }
}