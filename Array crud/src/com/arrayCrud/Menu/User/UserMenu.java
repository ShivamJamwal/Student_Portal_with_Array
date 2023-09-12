package com.arrayCrud.Menu.User;

import com.arrayCrud.Operation.Admin.AdminLogin;
import com.arrayCrud.Operation.User.UserLogin;
import com.arrayCrud.Operation.User.UserRegistration;

import java.util.Scanner;

public class UserMenu {
    public static void userMenu(){
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("#######################################");
            System.out.println("********Welcome to User portal********");
            System.out.println("#######################################");
            System.out.println("DESCRIPTION" +
                    "First Register than Login");
            System.out.println("$$$$$$Enter 1 for user login$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$$$$$$Enter 2 for user Registration$$$$$$$$$$$$$$$$$");
            System.out.println("$$$$$$Enter o for exit$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            int reg = sc.nextInt();
            if (reg == 1) {
                UserLogin.userLogin();
            } else if (reg==2) {
                UserRegistration.userRegistration();
            } else if (reg==0) {
                break;
            } else {
                System.out.println("Invalid number");
            }
        }
    }
}
