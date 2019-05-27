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
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.根据id获取Bean对象
        //AccountService accountService = ac.getBean("accountService", AccountService.class);
        //accountService.saveAccount();


//        AccountService accountService2 = ac.getBean("accountService2", AccountService.class);
//        accountService2.saveAccount();


        AccountService accountService3 = ac.getBean("accountService3", AccountService.class);
        accountService3.saveAccount();
    }
}
