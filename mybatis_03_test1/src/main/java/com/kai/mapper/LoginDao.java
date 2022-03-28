package com.kai.mapper;

import com.kai.pojo.SysUsers;
import org.apache.ibatis.annotations.Param;

public interface LoginDao {
    int insert(SysUsers users);
    SysUsers searchUser(@Param("username") String name, @Param("password") String password);

}
