package com.crossing.dao.impl;

import com.crossing.dao.AccountDao;
import org.springframework.stereotype.Repository;

/**
 * 账户的持久层实现类
 * @author Crossing
 * @date 2019-05-27
 */
@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {

    /**
     * 模拟接口实现类
     */
    public void saveAccount() {
        System.out.println("保存了账户");
    }
}
