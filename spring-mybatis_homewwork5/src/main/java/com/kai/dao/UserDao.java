package com.kai.dao;


import com.kai.pojo.SysUsers;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    /*注册用户*/
    @Insert("insert  sys_users values (null,#{usersn},#{password},#{name},#{age},#{sex}) ")
    int insert(SysUsers users);

    /*登录验证*/
    @Select("select count(*) from sys_users where usersn=#{username} and password=#{password}")
    int searchUser(@Param("username") String name, @Param("password") String password);

    /*用户修改*/
    int modify(@Param("id")int id,@Param("name")String name,@Param("age") int age);

    /*用户查询*/
    int searchs(SysUsers users);

    /*多对多/**/
    List<SysUsers> queryAllUsers();
}
