package com.ihowq.VTopic.cache;

import com.ihowq.VTopic.test.redis.ManagerService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by howq on 2017/3/15.
 */
public class RedisAopTest {


    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-test/applicationContext-redis-test.xml");
        ManagerService managerService = (ManagerService) context.getBean("managerService");
        System.out.println("第一次执行查询：" + managerService.queryFullNameById(110L));
        System.out.println("----------------------------------");

        System.out.println("第二次执行查询：" + managerService.queryFullNameById(110L));
        System.out.println("----------------------------------");

        managerService.deleteById(110L);
        System.out.println("----------------------------------");

        System.out.println("清除缓存后查询：" + managerService.queryFullNameById(110L));
        System.out.println("----------------------------------");

        System.out.println(managerService.modifyFullNameById(110L, "ZhangJunBao"));
        System.out.println("----------------------------------");

        System.out.println("修改数据后查询：" + managerService.queryFullNameById(110L));
        System.out.println("----------------------------------");

        System.out.println("第一次执行查询：" + managerService.queryFullNameById(112L));
        System.out.println("----------------------------------");

        System.out.println("第二次执行查询：" + managerService.queryFullNameById(112L));
        System.out.println("----------------------------------");
    }

}
