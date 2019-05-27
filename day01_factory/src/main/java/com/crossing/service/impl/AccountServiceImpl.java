package com.crossing.service.impl;

import com.crossing.dao.AccountDao;
import com.crossing.dao.impl.AccountDaoImpl;
import com.crossing.factory.BeanFactory;
import com.crossing.service.AccountService;

/**
 * 账户的业务层实现类
 * @author Crossing
 * @date 2019-05-27
 */
public class AccountServiceImpl implements AccountService {


    //AccountDao accountDao = new AccountDaoImpl();
    AccountDao accountDao = (AccountDao) BeanFactory.getBean("accountDao");

    private int i = 1;
    @Override
    public void saveAccount() {
        accountDao.saveAccount();
        System.out.println(i);
        i++;
    }
}
