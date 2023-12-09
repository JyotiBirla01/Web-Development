import java.util.*;
import java.io.*;

//Employe class
class Employe {
    int pin;
    String name;
    String gender;
    long mobile;
    Date joiningDate = new Date();
}

// Customer class
class Customer {
    String name;
    String gender;
    long mobile;
    long accountNo;
    String address;
    int pin;
    int age;
    double amt;
    String ifscCode;
    String dob;
    Date deposit = new Date();
    Date withdraw = new Date();
}

public class Bank_Project {
    public static void main(String a[]) throws Exception {
        // clear();
        Scanner sc = new Scanner(System.in);
        int ch;
        String color, reset = "\u001B[0m";

        color = "\u001B[31m";

        System.out.println("\t\t\t\t\t\t====================================================================\n");
        System.out.println(color + "\t\t\t\t\t\t\t\t\tState Bank Of India\n" + reset);
        System.out.println("\t\t\t\t\t\t====================================================================\n");
        System.out.println("\t\t\t\t\t\t\t\tPlease Choose An Option: ");

        color = "\u001B[34m";
        System.out.println(color + "\n\n\t\t\t\t\t\t\t\t1. Bank Employee: " + reset);
        System.out.println(color + "\t\t\t\t\t\t\t\t2. Bank Customer: " + reset);

        System.out.println(color + "\t\t\t\t\t\t\t\t3. Exit" + reset);

        System.out.print("\n\n\t\t\t\t\t\t\t\tPlease Choose An Option: ");

        ch = sc.nextInt();

        switch (ch) {
            case 1:
                employe();
                break;
            // case 2:
            // custmer();
            // break;
            case 3:
                System.exit(0);
        }
    }

    public static void employe() throws Exception {
        // local variable
        int ch;
        Scanner s = new Scanner(System.in);
        String color = "\u001B[34m", reset = "\u001B[0m";
        String t;

        while (true) {
            // clear();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println(color + "\t\t\t\t\t\t\t\t\t1. Employee Registration: " + reset);
            System.out.println(color + "\t\t\t\t\t\t\t\t\t2. Employee Login: " + reset);
            System.out.println(color + "\t\t\t\t\t\t\t\t\t3. Exit" + reset);
            System.out.print("\n\n\t\t\t\t\t\t\t\t\tPlease Choose An Option: ");

            ch = s.nextInt();

            switch (ch) {
                case 1:
                    signup();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    System.exit(0);
            }

            System.out.print("\t\t\t\t\t\t\t\t\t\tDo You Want To Continue [Y/N]: ");
            s.nextLine();
            t = s.nextLine();

            if (t.equals("n"))
                break;
        }
    }

    // Signup Function
    public static void signup() throws Exception {
        // clear();

        // Basic Requirment object
        Employe em = new Employe();
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        String pin;

        System.out
                .print("\t\t\t\t\t\t\tPlease Enter The Password Provided By Admin To Activate Your Employee Profile: ");
        Console con = System.console();
        char[] chars = con.readPassword();
        pin = new String(chars);

        if (pin.equals("Bank@123")) {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("\t\t\t\t\t\t\t\t\tYour Login Pin Has Been Generated Successfully!");
            em.pin = random.nextInt(10000);

            System.out.print("\t\t\t\t\t\t\t\t\tPlease Enter Your Name: ");
            em.name = s.nextLine();

            System.out.print("\t\t\t\t\t\t\t\t\tGender[M/F]: ");
            em.gender = s.nextLine();

            System.out.print("\t\t\t\t\t\t\t\t\tPlease Enter Your 10 Digits Mobile Number: ");
            em.mobile = s.nextLong();

            // System.out.print("\t\t\t\t\t\t\t\t\tJoining Date: " + em.joiningDate);

            // write data in file
            FileWriter fw = new FileWriter("employe.txt", true);
            PrintWriter pw = new PrintWriter(fw);

            pw.print(em.pin);
            pw.print(" ");
            pw.print(em.name);
            pw.print(" ");

            pw.print(em.gender);
            pw.print(" ");
            pw.print(em.mobile);
            pw.print("\n");

            pw.flush();
            pw.close();

            System.out.print("\n\n\n\t\t\t\t\t\t\t\t\tCongratulations! You Are Registered Successfully.");
        } else {
            System.out.println("\t\t\t\t\t\t\t\t\tInvalid Password Or You Are Not A Selected Candidate.");
            return;
        }
    }

    // Login Function
    public static void login() throws Exception {
        // clear();

        Scanner s = new Scanner(System.in);
        String localpin = null, pin;
        String line = null;
        boolean f = true;

        System.out.print("\t\t\t\t\t\t\t\t\tPlease Enter Your Pin: ");
        Console con = System.console();
        char[] chars = con.readPassword();
        pin = new String(chars);

        FileReader fr = new FileReader("employe.txt");
        BufferedReader br = new BufferedReader(fr);

        while ((line = br.readLine()) != null) {
            String temp[] = line.split(" ");
            localpin = temp[0];
            String color = "\u001B[34m", reset = "\u001B[0m";

            if (pin.equals(localpin)) {
                // clear();
                f = false;

                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("\t\t\t\t\t\t\t\t\tEMPLOYEE DASHBOARD\n\n");
                System.out.println("\t\t\t\t\t\t\t\t\tWelcome : " + temp[1] + " " + temp[2]);

                System.out.println(color + "\t\t\t\t\t\t\t\t\t1. List Of All Customers: " + reset);
                System.out.println(color + "\t\t\t\t\t\t\t\t\t2. List Of All Home Loan Customers: " + reset);
                System.out.println(color + "\t\t\t\t\t\t\t\t\t3. List Of All Education Loan Customers: " + reset);
                System.out.println(color + "\t\t\t\t\t\t\t\t\t4. Add Offer: " + reset);
                System.out.println(color + "\t\t\t\t\t\t\t\t\t5. Remove Offer: " + reset);
                System.out.println(color + "\t\t\t\t\t\t\t\t\t6. Exit: " + reset);
                System.out.print("\n\n\t\t\t\t\t\t\t\t\tPlease Choose An Option: ");
                int ch;
                ch = s.nextInt();
                switch (ch) {
                    case 1:
                        listOfAllUsers();
                        break;
                    // case 2:
                    // listOfAllHomeLoanUsers();
                    // break;
                    case 3:
                        listOfAllEducationLoanUsers();
                        break;
                    case 4:
                        System.exit(0);
                }

            }
        }
        if (f)
            System.out.println("\t\t\t\t\t\t\t\t\t\tYou Have Entered Invalid Pin! Please Try Again.");

        fr.close();
        br.close();
    }

    // List Of All Education Loan Users
    public static void listOfAllEducationLoanUsers() throws Exception {
        String line = null;
        FileReader fr = new FileReader("educationloan.txt");
        BufferedReader br = new BufferedReader(fr);

        String name, gender, fatherName, course, collegeName;
        int age, c = 1;
        long mobile;
        double fatherSalary;

        while ((line = br.readLine()) != null) {
            String temp[] = line.split("\t");
            name = temp[0];
            age = Integer.parseInt(temp[1]);
            fatherName = temp[2];
            collegeName = temp[3];
            mobile = Long.parseLong(temp[4]);
            fatherSalary = Double.parseDouble(temp[5]);
            gender = temp[6];
            course = temp[7];

            System.out.print("User: " + c);
            System.out.println("\n\n");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Father's Name: " + fatherName);
            System.out.println("College Name: " + collegeName);
            System.out.println("Mobile Number: " + mobile);
            System.out.println("Father's Salary: " + fatherSalary);
            System.out.println("Gender: " + gender);
            System.out.println("Course: " + course);

            c++;
            System.out.println("\n\n");
        }

        fr.close();
        br.close();
    }

    // List Of All Users
    public static void listOfAllUsers() throws Exception {
        int c = 1;
        String line = null;
        FileReader fr = new FileReader("customer.txt");
        BufferedReader br = new BufferedReader(fr);
        Customer s = new Customer();

        while ((line = br.readLine()) != null) {
            String temp[] = line.split("\t");
            s.pin = Integer.parseInt(temp[0]);
            s.accountNo = Long.parseLong(temp[1]);
            s.ifscCode = temp[2];
            s.name = temp[3];
            s.gender = temp[4];
            s.address = temp[5];
            s.age = Integer.parseInt(temp[6]);
            s.mobile = Long.parseLong(temp[7]);
            s.dob = temp[8];
            s.amt = Double.parseDouble(temp[9]);

            System.out.print("User: " + c);
            System.out.println("\n\n");
            System.out.println("Pin: " + s.pin);
            System.out.println("Account Number: " + s.accountNo);
            System.out.println("IFSC Code: " + s.ifscCode);
            System.out.println("Name: " + s.name);
            System.out.println("Gender: " + s.gender);
            System.out.println("Address: " + s.address);
            System.out.println("Age: " + s.age);
            System.out.println("Mobile Number: " + s.mobile);
            System.out.println("DOB: " + s.dob);
            System.out.println("Amount: " + s.amt);

            c++;
            System.out.println("\n\n");
        }

        fr.close();
        br.close();
    }
    // Custmer method
    // public static void custmer() throws Exception {
    // Scanner s = new Scanner(System.in);
    // int ch;
    // String line, t;
    // String color = "\u001B[31m";
    // String reset = "\u001B[0m";
    // while (true) {
    // // clear();
    // System.out.println("\n\n");
    // // System.out.println(color + "\t\t\t\t\t\t\t\t\t\tExciting Offers For You!"
    // + reset);
    // System.out.println("\n");
    // color = "\u001B[33m";
    // FileReader fr = new FileReader("bankoffer.txt");
    // BufferedReader br = new BufferedReader(fr);
    // while ((line = br.readLine()) != null) {
    // System.out.println(color + "\t\t\t\t\t\t\t" + line + reset);
    // System.out.print("\n");
    // }

    // fr.close();
    // br.close();

    // color = "\u001B[36m";

    // System.out.println("\n\n\n");
    // System.out.println(color + "\t\t\t\t\t\t\t\t\t1. Create New Account" +
    // reset);
    // System.out.println(color + "\t\t\t\t\t\t\t\t\t2. Check Your Balance" +
    // reset);
    // System.out.println(color + "\t\t\t\t\t\t\t\t\t3. Withdraw Money" + reset);
    // System.out.println(color + "\t\t\t\t\t\t\t\t\t4. Deposit" + reset);
    // System.out.println(color + "\t\t\t\t\t\t\t\t\t5. Transfer Money" + reset);
    // System.out.println(color + "\t\t\t\t\t\t\t\t\t6. Check Your All Last
    // Transaction" + reset);
    // System.out.println(color + "\t\t\t\t\t\t\t\t\t7. Net Banking" + reset);
    // System.out.println(color + "\t\t\t\t\t\t\t\t\t8. Delete Account" + reset);
    // System.out.println(color + "\t\t\t\t\t\t\t\t\t9. Apply For Loan" + reset);
    // System.out.println(color + "\t\t\t\t\t\t\t\t\t10. Update Your Account" +
    // reset);
    // System.out.println(color + "\t\t\t\t\t\t\t\t\t11. Exit" + reset);
    // System.out.print("\n\n\t\t\t\t\t\t\t\t\tPlease Choose An Option: ");
    // ch = s.nextInt();

    // switch (ch) {
    // case 1:
    // newAccount();
    // break;
    // case 2:
    // CheckBalance();
    // break;
    // case 3:
    // withdraw();
    // break;
    // case 4:
    // deposit();
    // break;
    // case 5:
    // transferMoney();
    // break;
    // case 6:
    // checkAllLastTransaction();
    // break;

    // case 8:
    // deleteAccount();
    // break;
    // case 9:
    // applyLoan();
    // break;
    // case 10:
    // updateAccount();
    // break;
    // case 11:
    // System.exit(0);
    // }

    // System.out.print("\t\t\t\t\t\t\t\t\t\tDo You Want To Continue[Y/N]: ");
    // s.nextLine();
    // t = s.nextLine();

    // if (t.equals("n"))
    // break;
    // }
    // }
}