package com.arrayCrud.Menu.Admin;
import com.arrayCrud.Operation.Admin.AdminLogin;

import javax.imageio.IIOException;
import java.util.Scanner;
public class AdminMenu {
    public static void adminmenu()
     {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("#######################################");
            System.out.println("********Welcome to admin portal********");
            System.out.println("#######################################");
            System.out.println("$$$$$$Enter 1 for admin login$$$$$$");
            System.out.println("$$$$$$Enter o for exit$$$$$$$$");
            int reg = sc.nextInt();
            if (reg == 1) {
                AdminLogin.adminLogin();
            } else if (reg==0) {
                break;
            } else {
                System.out.println("Inavlid nuber");
            }
        }
    }
}