package com.crossing.service.impl;


import com.crossing.service.AccountService;

/**
 * 账户的业务层实现类
 * @author Crossing
 * @date 2019-05-27
 */
public class AccountServiceImpl implements AccountService {

    public void saveAccount() {
        System.out.println("service中的saveAccount方法执行了。。。");
    }
    public void init() {
        System.out.println("service中的初始化方法执行了。。。");
    }
    public void destroy() {
        System.out.println("service中的销毁方法执行了。。。");
    }
}
