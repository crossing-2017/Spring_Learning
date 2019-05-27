package com.crossing.service.impl;


import com.crossing.service.AccountService;

import java.util.Date;


/**
 * 账户的业务层实现类
 * @author Crossing
 * @date 2019-05-27
 */
public class AccountServiceImpl implements AccountService {

    //如果是经常变化的数据，并不适用于注入的方式
    private String name;
    private Integer age;
    private Date birth;


    public AccountServiceImpl(String name, Integer age, Date birth) {
        this.name = name;
        this.age = age;
        this.birth = birth;
    }

    public void saveAccount() {
        System.out.println("service中的saveAccount方法执行了。。。" + name + "," + age + "," + birth);
    }
}
