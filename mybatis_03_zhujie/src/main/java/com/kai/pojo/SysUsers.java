package com.kai.pojo;

import java.io.Serializable;
import java.util.List;

public class SysUsers implements Serializable {
    private Integer id;
    private String usersn;//账号
    private String password;//密码
    private String name;//姓名
    private int age;//年龄
    private String sex;//性别

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "SysUsers{" +
                "id=" + id +
                ", usersn='" + usersn + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
