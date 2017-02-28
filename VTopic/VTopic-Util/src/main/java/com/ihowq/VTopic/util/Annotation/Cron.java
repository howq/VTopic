package com.ihowq.VTopic.util.Annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * @author HXW
 * @version $Id: Cron.java, v 0.1 2016年10月10日 下午5:51:04 HXW Exp $
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Cron {

    String name();

    String group() default "DEFAULT_GROUP";

    String cronExp();

    String timeZone() default "Asia/ShangHai";
}
