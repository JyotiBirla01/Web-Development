

//package com.mycompany.bankmanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;


public class BankManagementSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int ch;
        String color, reset = "\u001B[0m";

        color = "\u001B[31m";

        System.out.println("\t\t\t\t====================================================================\n");
        System.out.println(color + "\t\t\t\t\t\t\tState Bank Of India\n" + reset);
        System.out.println("\t\t\t\t====================================================================\n");
        System.out.println("\t\t\t\t\t\tPlease Choose An Option: ");

        color = "\u001B[34m";
        System.out.println(color + "\n\t\t\t\t\t\t1. Bank Employee: " + reset);
        System.out.println(color + "\t\t\t\t\t\t2. Bank Customer: " + reset);

        System.out.println(color + "\t\t\t\t\t\t3. Exit" + reset);

        System.out.print("\n\n\t\t\t\t\t\tPlease Choose An Option: ");

        ch = sc.nextInt();
       Admin admin = new Admin();
       Customers cus = new Customers();
        switch (ch) {
            case 1:
               admin.employee();
                        
                break;
            case 2:
               System.out.print("Enter  the Employee Mobile Number :");
               long mobile = sc.nextLong();
               System.out.print("\nEnter  the Employee PIN Number :");
               int pin = sc.nextInt();
               admin.empLogin(mobile, pin);
                break;
            case 3:
                System.exit(0);
        }
    }

}
