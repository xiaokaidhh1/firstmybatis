package com.kai.pojo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class SysRoles implements Serializable {
    private Integer id;//角色id
    private String name;//角色名  比如系统管理员，超级用户，电影管理员等等
    private String permission;//权限
}
