package com.crossing.dao.impl;

import com.crossing.dao.AccountDao;

/**
 * 账户的持久层实现类
 * @author Crossing
 * @date 2019-05-27
 */
public class AccountDaoImpl implements AccountDao {

    /**
     * 模拟接口实现类
     */
    @Override
    public void saveAccount() {
        System.out.println("保存了账户");
    }
}
