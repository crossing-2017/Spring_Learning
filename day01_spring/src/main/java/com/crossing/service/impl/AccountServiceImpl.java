package com.crossing.service.impl;

import com.crossing.dao.AccountDao;
import com.crossing.dao.impl.AccountDaoImpl;
import com.crossing.service.AccountService;

/**
 * 账户的业务层实现类
 * @author Crossing
 * @date 2019-05-27
 */
public class AccountServiceImpl implements AccountService {


    AccountDao accountDao = new AccountDaoImpl();

    public void saveAccount() {
        accountDao.saveAccount();
    }
}
