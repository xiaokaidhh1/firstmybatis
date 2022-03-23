package com.kai.pojo;

import java.io.Serializable;
import java.util.List;

public class SysRoles implements Serializable {
    private Integer id;//角色id
    private String name;//角色名  比如系统管理员，超级用户，电影管理员等等
    private String permission;//权限
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    @Override
    public String toString() {
        return "SysRoles{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", permission='" + permission + '\'' +
                '}';
    }
}
