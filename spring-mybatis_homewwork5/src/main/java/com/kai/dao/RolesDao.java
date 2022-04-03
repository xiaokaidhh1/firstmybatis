package com.kai.dao;

import com.kai.pojo.SysRoles;
import java.util.List;

public interface RolesDao {
    List<SysRoles> selectRolesById(int id);
}
