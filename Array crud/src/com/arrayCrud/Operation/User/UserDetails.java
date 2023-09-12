package com.arrayCrud.Operation.User;

import com.arrayCrud.Menu.Menu;

import java.util.Scanner;

import static com.arrayCrud.Operation.Admin.AdminLogin.arr;
import static com.arrayCrud.Operation.Admin.AdminLogin.arra;

public class UserDetails {
    public static void userDetails(){
        try{
            for (int i = 0; i < arra.length; i++) {
                System.out.println("User Details" + arra[i]);
            }
        }
        catch (NullPointerException e){
            for (int i = 0; i < arr.length ; i++) {
                System.out.println("User Details" +arr[i]);
            }
        }
        System.out.println("Press 0 for exit");
        System.out.println("Press 1 for Main Menu");
        Scanner sc=new Scanner(System.in);
        int reg= sc.nextInt();
        if(reg==1)
        {
            Menu.menu();
        } else if (reg==0) {
        System.exit(0);
        }
        else {
            System.out.println("Invalid number you add");
        }
    }

    }

