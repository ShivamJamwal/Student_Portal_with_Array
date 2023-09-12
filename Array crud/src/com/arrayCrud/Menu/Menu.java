package com.arrayCrud.Menu;

import com.arrayCrud.Menu.Admin.AdminMenu;
import com.arrayCrud.Menu.User.UserMenu;

import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);

    public static void menu() {
        while (true) {
            System.out.println("********Welcome to the student portal**********");
            System.out.println("$$$$$$$$$$$Press 1 for Admin$$$$$$$$");
            System.out.println("##########Press 2 for User########");
            System.out.println("##########Press 0 for Exit########");
            int ch= sc.nextInt();
            if(ch==1) {
                AdminMenu.adminmenu();
            } else if (ch==0) {
                System.out.println("@@@@@Thankyou@@@@@@");
                break;

            } else if ((ch==2)) {
                UserMenu.userMenu();
            } else{
                System.out.println("Invalid number");
            }

    }
}
}
