package com.kai.mapper;

import com.kai.pojo.SysUsers;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    int modify(@Param("id")int id,@Param("name")String name,@Param("age") int age);
    int searchs(SysUsers users);
}
