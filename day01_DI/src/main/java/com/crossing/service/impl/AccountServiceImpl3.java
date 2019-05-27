package com.crossing.service.impl;


import com.crossing.service.AccountService;
import lombok.Setter;

import java.util.*;


/**
 * 账户的业务层实现类
 * @author Crossing
 * @date 2019-05-27
 */

@Setter
public class AccountServiceImpl3 implements AccountService {

    private String[] myStrs;
    private List<String> myList;
    private Set<String> mySet;
    private Map<String,String> myMap;
    private Properties myProps;


    public void  saveAccount(){
        System.out.println(Arrays.toString(myStrs));
        System.out.println(myList);
        System.out.println(mySet);
        System.out.println(myMap);
        System.out.println(myProps);
    }
}
