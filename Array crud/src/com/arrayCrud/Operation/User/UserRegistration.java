package com.arrayCrud.Operation.User;

import com.arrayCrud.Entity.User;

import java.util.Scanner;

public class UserRegistration {
  public   static User[] users=new User[1];
    public static void userRegistration(){

        for (int i = 0; i <users.length ; i++) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the username");
        String userid=sc.nextLine();
        System.out.println("Enter the password");
        String pwd=sc.nextLine();
        User user=new User();
        user.setUserName(userid);
        user.setPassWord(pwd);
        users[i]=user;
        System.out.println("Registerd Succesfully");
    }
}}
