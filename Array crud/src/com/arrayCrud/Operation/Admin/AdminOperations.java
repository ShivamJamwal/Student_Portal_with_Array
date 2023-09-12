package com.arrayCrud.Operation.Admin;
import com.arrayCrud.Entity.Admin;
import com.arrayCrud.Menu.Menu;

import java.sql.SQLOutput;
import java.util.Arrays;
import static com.arrayCrud.Operation.Admin.AdminLogin.*;
public class AdminOperations {
    public static void adminOperations() {
        while(true){
            System.out.println("---------Welcome to admin portal-------------");
            System.out.println("Description::In this Portal admin can create,update,display,delete,search user details");
            System.out.println("Press 1 for create user");
            System.out.println("Press 2 for search user");
            System.out.println("Press 3 for update user");
            System.out.println("Press 4 for delete user");
            System.out.println("Press 5 for display user");
            System.out.println("Press 6 for Main Menu");
            System.out.println("Press 0 for EXIT the whole portal");
            int ch = sc.nextInt();
            if (ch == 1) {
                System.out.println("enter the number of user that you want to created");
                int arra = sc.nextInt();
                arr = new Admin[arra];

                for (int i = 0; i < arr.length; i++) {
                    System.out.println("enter the id");
                    int uid = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the name ");
                    String unmae = sc.nextLine();
                    System.out.println("Enter the grade");
                    String grade=sc.nextLine();
                    Admin admin = new Admin(uid, unmae,grade);
                    arr[i] = admin;
                    System.out.println(arr[i]);
                    System.out.println("User succesfull created");

                }

            } else if (ch == 2) {
                System.out.println("enter the id of the user that you want to search");
                int ud = sc.nextInt();
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].getId() == ud) {


                        System.out.println(arr[i]);
                        break;

                    } else {
                        System.out.println("NO ID Found");

                    }

                }


            } else if (ch == 3) {
               // System.out.println("enter 1 for id update");
                System.out.println("enter the id of the user that you want to update");
                int ud = sc.nextInt();
                 sc.nextLine();
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].getId() == ud ) {
                        System.out.println("enter the name ");
                        String name= sc.nextLine();
                        System.out.println("enter the Grade ");
                        String grade= sc.nextLine();
                        System.out.println("Enter the id");
                        int uid= sc.nextInt();
                        arr[i].setName(name);
                        arr[i].setId(uid);
                        arr[i].setGrade(grade);
                        System.out.println("succesfully updated"+arr[i]);

                    }


                }

            }

            else if (ch==4) {

                System.out.println("enter the id that you want to delete");
                int id=sc.nextInt();
                arra=new Admin[arr.length-1];
                for (int i = 0,j=0; i< arr.length; i++) {


                        if (arr[i].getId() == id) {
                            continue;
                        }
                        arra[j++] = arr[i];

                        System.out.println("Deleted successfully");

                    }
                }




                        if (ch == 5) {
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
                    } else if (ch == 0) {
                        System.exit(0);

                    } else if (ch==6) {
                            Menu.menu();

                        }
        }}}



