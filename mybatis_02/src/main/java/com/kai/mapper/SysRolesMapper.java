package com.kai.mapper;

import com.kai.pojo.SysRoles;

import java.io.Flushable;
import java.util.List;

public interface SysRolesMapper {

    List<SysRoles> selectRolesById(int id);

}
