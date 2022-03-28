package com.kai.pojo;

public class SysUsers {

  private long id;
  private String usersn;
  private String password;
  private String name;
  private long age;
  private String sex;

  public SysUsers() {
  }


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUsersn() {
    return usersn;
  }

  public void setUsersn(String usersn) {
    this.usersn = usersn;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getAge() {
    return age;
  }

  public void setAge(long age) {
    this.age = age;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

}
