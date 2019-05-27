package com.crossing.service.impl;


import com.crossing.service.AccountService;
import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import lombok.Data;
import lombok.Setter;

import java.util.Date;


/**
 * 账户的业务层实现类
 * @author Crossing
 * @date 2019-05-27
 */

@Setter
public class AccountServiceImpl2 implements AccountService {

    private String name;
    private Integer age;
    private Date birth;


    public void saveAccount() {
        System.out.println("service中的saveAccount方法执行了。。。" + name + "," + age + "," + birth);
    }
}
