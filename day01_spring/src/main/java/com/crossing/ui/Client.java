package com.crossing.ui;

import com.crossing.service.AccountService;
import com.crossing.service.impl.AccountServiceImpl;

/**
 * 模拟表现层，调用业务层
 * @author Crossing
 * @date 2019-05-27
 */
public class Client {
    public static void main(String[] args) {
        AccountService accountService = new AccountServiceImpl();
        accountService.saveAccount();
    }
}
