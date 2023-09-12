package com.arrayCrud.Entity;

public class User{
 private String userName;
 private String passWord;

    public String getUserName() {
        return userName;
    }

    public User() {
    }

    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}