package com.kai.service.impl;

import com.kai.dao.UserDao;
import com.kai.pojo.SysUsers;
import com.kai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    UserDao userDao;

    /*登录*/
    @Override
    public int login(String username, String password) {
        int num = userDao.searchUser(username,password);
        return num;
    }

    public UserServiceimpl() {
        super();
    }

    /*注册*/
    @Override
    public int reg(SysUsers users) {
        int num = userDao.insert(users);
        return num;
    }

    /*修改*/
    @Override
    public int modify(int id, String name, int age) {
        int num = userDao.modify(id, name, age);
        return num;
    }
    /*查询*/
    @Override
    public int searchs(SysUsers user) {
        int num = userDao.searchs(user);
        return num;

    }
    /*多对多查询*/
    @Override
    public List<SysUsers> queryAllUsers() {
      return userDao.queryAllUsers();
    }


}
