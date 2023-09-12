package com.arrayCrud.Operation.User;

import java.util.Scanner;

import static com.arrayCrud.Operation.User.UserRegistration.users;

public class UserLogin {
    public static void userLogin(){
        while(true){
        for (int i = 0; i <users.length ; i++) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the username");
            String uid=sc.nextLine();
            System.out.println("Enter the password");
            String pwd=sc.nextLine();
            if (users[i].getUserName().equals(uid)&&users[i].getPassWord().equals(pwd)){
                System.out.println("Loggin succesfull");
                System.out.println("Press 1 for see the user details");
                System.out.println("Press 0 for exit");
                int reg=sc.nextInt();
                if(reg==1){
                  UserDetails.userDetails();
                } else if (reg==0) {
                    break;
                }
            }else{
                System.out.println("Invalid credentials you add");
            }
        }
    }
}}
