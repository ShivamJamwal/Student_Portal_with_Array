package com.arrayCrud.Operation.Admin;

import com.arrayCrud.Entity.Admin;
import com.arrayCrud.Menu.Admin.AdminMenu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AdminLogin {
    public static Admin[] arr;
    public static Admin[] arra;
    static Scanner sc = new Scanner(System.in);
    static BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

    public static void adminLogin()  {
        String userId = "shivam@admmin";
        String password = "1234";

        System.out.println("Enter UserId : ");
        String getId= null;
        try {
            getId = bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Enter Password");
        String getPass = null;
        try {
            getPass = bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (getId.equals(userId) && (getPass.equals(password))) {

            System.out.println("Login Successful");
            System.out.println("WELCOME SHIVAM");
            System.out.println("Press 1 for Doing Admin Operations");
            System.out.println("Press 0 for exit");
            int ch = sc.nextInt();
            if (ch == 1) {
                AdminOperations.adminOperations();
            }
            if (ch == 0) {
                AdminMenu.adminmenu();
            }
        } else {
            System.out.println("Invalid credentials you add");
            System.out.println("Press 1 for retry");
            System.out.println("Press 0 for exit");
            int reg = sc.nextInt();
            if (reg == 1) {
                AdminMenu.adminmenu();

            } else if (reg== 0) {
                System.exit(0);

        }
    }
}}

