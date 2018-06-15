package com.mooc.house.common.model;

/**
 * @Package: com.mooc.house.common.model
 * @Class: User
 * @Description: 用户实体类
 * @Author: zhangyahui
 * @Date: 2018/4/8 19:11
 */
public class User {

    private long id;
    private String name;
    private String email;
    private  String phone;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }



}
