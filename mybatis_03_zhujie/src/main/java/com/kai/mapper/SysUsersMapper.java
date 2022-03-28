package com.kai.mapper;

import com.kai.pojo.SysUsers;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;


public interface SysUsersMapper {
    //注解增加
    @Insert("insert into sys_users (usersn,password,name,age,sex) values(#{usersn},#{password},#{name},#{age},#{sex})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertAll(SysUsers sysUsers);

    //注解删除
    @Delete("delete from sys_users where id=#{usrId}")
    int del(@Param("usrId") int id);

}
