package com.crossing.ui;

import com.crossing.factory.BeanFactory;
import com.crossing.service.AccountService;

/**
 * 模拟表现层，调用业务层
 * @author Crossing
 * @date 2019-05-27
 */
public class Client {
    public static void main(String[] args) {
//        AccountService accountService = new AccountServiceImpl();

        for (int i = 0; i < 5; i++) {
            AccountService accountService = (AccountService) BeanFactory.getBean("accountService");
            System.out.println(accountService);
            accountService.saveAccount();
        }
        /*AccountService accountService = (AccountService) BeanFactory.getBean("accountService");
        accountService.saveAccount();*/
    }
}
