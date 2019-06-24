package com.example.CRUD.models;

//Represent entities' response model (both are very similar)
public class UserModel {

    private int id;

    private String user_name;

    private String hashed_pwd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getHashed_pwd() {
        return hashed_pwd;
    }

    public void setHashed_pwd(String hashed_pwd) {
        this.hashed_pwd = hashed_pwd;
    }
}
