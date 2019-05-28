package com.crossing.service;

/**
 * 账户的业务层接口
 */
public interface AccountService {

    /**
     * 模拟保存账户
     */
    public void saveAccount();

    /**
     * 模拟更新账户
     * @param i
     */
    public void updateAccount(Integer i);

    /**
     * 删除账户
     * @return
     */
    public int deleteAccount();
}
