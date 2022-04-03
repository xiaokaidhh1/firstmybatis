package com.kai.service;

import com.kai.pojo.SysUsers;

import java.util.List;

public interface UserService {
    /*登录验证*/
    int login(String username,String password);

    /*注册用户*/
    int reg(SysUsers users);

    /*用户修改*/
    int modify(int id,String name,int age);

    /*用户查询*/
    int searchs(SysUsers user);

    /*多对多查询*/
    List<SysUsers> queryAllUsers();
}
