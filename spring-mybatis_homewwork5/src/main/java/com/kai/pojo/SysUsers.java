package com.kai.pojo;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class SysUsers {
  private long id;
  private String usersn;
  private String password;
  private String name;
  private long age;
  private String sex;
  List<SysRoles> sysRoles;//多对多  声明另一方的集合属性
}
