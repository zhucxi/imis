package com.imis.project.test.entity;

//import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotation.TableName;
import com.imis.frame.core.entity.BaseEntity;

import java.io.Serializable;

@TableName("TB_TestEntity")
public class TestEntity extends BaseEntity{

    private static final long serialVersionUID = 1L;
    private String username;
    private String password;
    private int sex;
    private boolean openstate;//开启状态
    private String birthday;

    public TestEntity() {
    }

    public TestEntity(String username, String password, int sex, boolean openstate, String birthday) {
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.openstate = openstate;
        this.birthday = birthday;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public boolean isOpenstate() {
        return openstate;
    }

    public void setOpenstate(boolean openstate) {
        this.openstate = openstate;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "TestEntity{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                ", openstate=" + openstate +
                ", birthday=" + birthday +
                '}';
    }
}
