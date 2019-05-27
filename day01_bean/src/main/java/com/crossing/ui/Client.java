package com.crossing.ui;

import com.crossing.service.AccountService;
import com.crossing.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟表现层，调用业务层
 * @author Crossing
 * @date 2019-05-27
 */
public class Client {

    public static void main(String[] args) {
        //1.获取核心容器对象
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.根据id获取Bean对象
        //AccountService accountService = (AccountService) ac.getBean("accountService");
        AccountService accountService = ac.getBean("accountService", AccountService.class);
        accountService.saveAccount();

        //手动关闭容器
        ac.close();
    }
}
