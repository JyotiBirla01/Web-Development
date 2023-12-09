

import java.util.ArrayList;
import java.util.Scanner;

public class BankManagementSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String color, reset = "\u001B[0m";

        color = "\u001B[31m";

        System.out.println("\t\t\t\t====================================================================\n");
        System.out.println(color + "\t\t\t\t\t\t\tState Bank Of India\n" + reset);
        System.out.println("\t\t\t\t====================================================================\n");
        System.out.println("\t\t\t\t\t\tPlease Choose An Option: ");

        color = "\u001B[34m";
        int ch = 0;

        System.out.println(color + "\n\t\t\t\t\t\t1. Bank Employee: " + reset);

        System.out.println(color + "\t\t\t\t\t\t2. Bank Customer: " + reset);

        System.out.println(color + "\t\t\t\t\t\t3. Exit" + reset);

        System.out.print("\n\n\t\t\t\t\t\tPlease Choose An Option: ");

        ch = sc.nextInt();
        Admin admin = new Admin();
        Customer customer = new Customer();

        switch (ch) {
            case 1:
                admin.employee();

                break;
            case 2:
                System.out.println("Enter Customer Account Number to Login");
                int account_num = sc.nextInt();
                System.out.println("Enter Customer Account Number to Login");
                int PIN = sc.nextInt();
                customer.customerLogin(account_num, PIN);
            case 3:
                System.exit(0);
        }

    }
}
