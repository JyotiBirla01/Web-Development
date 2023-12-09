package com.bankproject01.testmain;

import com.bankproject01.dao.AccountDao;
import com.bankproject01.dao.AdminDao;
import com.bankproject01.dao.CustomerDao;
import com.bankproject01.model.Account;
import com.bankproject01.model.Admin;
//import com.bankproject01.service.SendMail;
import com.bankproject01.service.Validation;
import java.util.Scanner;

public class TestMain {

    // Color
    static String setRed = "\u001B[31m";
    static String setYellow = "\u001B[33m";
    static String setGreen = "\u001B[32m";
    static String resetColor = "\u001B[0m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account a= new Account();

        while (true) {
            System.out.println("\t\t\t-------------------------------------------------------------------------------------------------------");
            System.out.println(" \t\t\t PRESS 1: Addmin login \t\t\t PRESS 2: Customer login \t\t\t" + TestMain.setRed + " PRESS 3: Exit" + TestMain.resetColor);
            System.out.println("\t\t\t-------------------------------------------------------------------------------------------------------");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:

                    System.out.println(TestMain.setYellow + "\t\t\t\t\t\t\t ***** ADMIN LOGIN PAGE *****\n\t " + TestMain.resetColor);

                    System.out.println("Admin id: ");
                    int id = sc.nextInt();
                    System.out.println("Admin password: ");
                    sc.nextLine();
                    String password = sc.nextLine();

                    // create object of Admin model
                    Admin admin = new Admin(id, password);

                    if (AdminDao.adminLogin(id, password)) {
                        System.out.println(TestMain.setGreen + "Admin successfully login......" + TestMain.resetColor);

                        while (true) {
                            System.out.println("\t\t\t-------------------------------------------------------------------------------------------------------");
                            System.out.println("\t\t\t PRESS 1: Create a new customer account \t\t\t\t PRESS 2: View particular account information \t\t\t");
                            System.out.println("\t\t\t PRESS 3: Block  account \t\t\t\t\t PRESS 4: View all account list \t\t\t");
                            System.out.println("\t\t\t PRESS 5: Back menu" + TestMain.setRed + "\t\t\t\t\t\t PRESS: 6 Exit program" + TestMain.resetColor);
                            System.out.println("\t\t\t-------------------------------------------------------------------------------------------------------");

                            int adminChoice = sc.nextInt();

                            switch (adminChoice) {
                                case 1:
                                    System.out.println("Enter Account type (PRESS 1. saving/ PRESS 2. current)");
                                    int type = sc.nextInt();
                                    sc.nextLine();
                                    String accType = "null";
                                    if (type == 1) {
                                        accType = "saving";
                                    } else if (type == 2) {
                                        accType = "current";
                                    }

                                    if (type == 1 || type == 2) {
                                        System.out.print("\t Enter your name: \n\t ");
                                        String firstName = sc.nextLine();
                                        boolean checkfName = firstName.matches("[a-zA-Z , ]+");
                                        if (checkfName) {
                                            System.out.print("\t Enter last name: \n\t ");
                                            String lastName = sc.nextLine();
                                            boolean checklName = lastName.matches("[a-zA-Z , ]+");
                                            if (checklName) {
                                                System.out.print("\t Enter your father name: \n\t ");
                                                String fatherName = sc.nextLine();
                                                boolean checkfatherN = fatherName.matches("[a-zA-Z , ]+");
                                                if (checkfatherN) {
                                                    System.out.print("\t Contact number: \n\t ");
                                                    String contactNum = sc.nextLine();
                                                    boolean checkContNum = contactNum.matches("\\d{10}");
                                                    if (checkContNum) {
                                                        System.out.print("\t Enter your email: \n\t ");
                                                        String email = sc.nextLine();
                                                        boolean checkEmail = Validation.checkEmail(email);
                                                        if (checkEmail) {
                                                            System.out.print("\t Enter your date of birth: (yyyy-mm-dd)\n\t ");
                                                            String dob = sc.nextLine();
                                                            boolean checkDob = dob.matches("\\d{4}-\\d{2}-\\d{2}");
                                                            if (checkDob) {
                                                                System.out.print("\t Aadhar number: \n\t ");
                                                                String aadharNumber = sc.nextLine();
                                                                boolean checkAadharnum = aadharNumber.matches("\\d{12}");
                                                                if (checkAadharnum) {
                                                                    System.out.print("\t Pancard number: \n\t ");
                                                                    String pancardNumber = sc.nextLine();
                                                                    boolean checkPanNum = pancardNumber.matches("[A-Z]{5}[0-9]{4}[A-Z]");
                                                                    if (checkPanNum) {
                                                                        System.out.print("\t Gender: (PRESS 1. male/ PRESS 2. female/ PRESS 3. other) \n\t ");
                                                                        int checkgender = sc.nextInt();
                                                                        sc.nextLine();
                                                                        String gender = "null";
                                                                        if (checkgender == 1) {
                                                                            gender = "male";
                                                                        } else if (checkgender == 2) {
                                                                            gender = "female";
                                                                        } else if (checkgender == 3) {
                                                                            gender = "other";
                                                                                                            }
                                                                        if (checkgender == 1 || checkgender == 2 || checkgender == 3) {
                                                                            System.out.print("\t Nominee name: \n\t ");
                                                                            String nomineeName = sc.nextLine();
                                                                            boolean checkNomineeName = nomineeName.matches("[a-zA-Z , ]+");
                                                                            if (checkNomineeName) {
                                                                                System.out.print("\t Address: \n\t ");
                                                                                String address = sc.nextLine();
                                                                                System.out.print("\t Branch: (PRESS 1. indore/ PRESS 2. dewas/ PRESS 3. ujjain) \n\t ");
                                                                                int checkbranch = sc.nextInt();
                                                                                sc.nextLine();
                                                                                String branchName = "null";
                                                                                if (checkbranch == 1) {
                                                                                    branchName = "indore";
                                                                                } else if (checkbranch == 2) {
                                                                                    branchName = "dewas";
                                                                                } else if (checkbranch == 3) {
                                                                                    branchName = "ujjain";
                                                                                }
                                                                                if (checkbranch == 1 || checkbranch == 2 || checkbranch == 3) {
                                                                                    System.out.print("Enter amount: ");
                                                                                    Double amount = sc.nextDouble();
                                                                                    if (((accType.equals("saving") || accType.equals("Saving")) && amount >= 500) || ((accType.equals("current") || accType.equals("Current")) && amount >= 1000)) {
                                                                                        Boolean toActive = true;
                                                                                        // create a object of account model 
                                                                                        Account account =new Account(firstName, lastName, fatherName, contactNum, email, dob, aadharNumber, pancardNumber, accType, branchName, gender, nomineeName, address, amount);
                                                                                        if (AccountDao.createUserAcc(account) != -1) {
                                                                                            System.out.println(TestMain.setGreen + "Account successfully created....." + TestMain.resetColor);
                                                                                            AccountDao.setEmailMsg(account);
                                                                                          //  SendMail sendMail = new SendMail();
                                                                                            //sendMail.main(args);
                                                                                        } else {
                                                                                            System.out.println("Oops! Something went wrong to prosses account create: ");
                                                                                        }
                                                                                    } else {
                                                                                        System.out.println("please enter minimum amount (saving = 500 / current = 1000)");
                                                                                    }
                                                                                } else {
                                                                                    System.out.println("\t Invalid branch \n\t ");
                                                                                }
                                                                            } else {
                                                                                System.out.println("Invalid nominee name: ");
                                                                            }
                                                                        } else {
                                                                            System.out.println("Invalid gender: ");
                                                                        }
                                                                    } else {
                                                                        System.out.println("Invalid pancard number: ");
                                                                    }

                                                                } else {
                                                                    System.out.println("Invalid aadhar number: ");
                                                                }

                                                            } else {
                                                                System.out.println("Invalid date of birth: ");
                                                            }

                                                        } else {
                                                            System.out.println("Invalid email");
                                                        }

                                                    } else {
                                                        System.out.println("Invalid mobile number: ");
                                                    }

                                                } else {
                                                    System.out.println("Invalid father name: ");
                                                }

                                            } else {
                                                System.out.println("Invalid last Name: ");
                                            }
                                        } else {
                                            System.out.println("Invalid Name: ");
                                        }
                                    } else {
                                        System.out.println("\t Invalid account type: \n\t ");
                                    }

                                    break;
                                case 2:
                                    System.out.println("Enter the account Number ");
                                    int accountNo= sc.nextInt();
                                    AccountDao.viewParticularAccount(accountNo);
                                    System.out.println("work in progress");
                                    break;

                                case 3:
                                    System.out.println("work in progress for block");
                                    System.out.println("Enter account number: ");
                                    String accountNumber = sc.nextLine();
                                    boolean checkAccNum = accountNumber.matches("\\d{10}");
                                    if (checkAccNum) {

                                    } else {
                                        System.out.println("Invalid account number: ");
                                    }
                                    break;
                                case 4:
                                   AccountDao.viewAllAccount();
                                   
                                    

                                    break;
                                case 5:
                                    break;
                                case 6:
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println(TestMain.setRed + "Something went wrong: " + TestMain.resetColor);
                            }
                        }

                    } else {
                        System.out.println(TestMain.setRed + "Oops! Something went wrong" + TestMain.resetColor);
                    }
                    break;
//customer login
                case 2:
                    System.out.println("Enter the account Number ");
                    int accountNumber= sc.nextInt();
                    System.out.println("Enter the Customer Name");
                    sc.nextLine();
                    String firstName= sc.nextLine();
                    
                    
                    CustomerDao customer= new CustomerDao();
                    Account acc= new Account();
                    if(customer.customerLogin(accountNumber,firstName)){
                        System.out.println("Customer login succesfully");
                        System.out.println( "\n\t\tCustomer Menu:" );
            System.out.println("1. Update  Information");
            System.out.println("2. View Balance");
            System.out.println("3. View Transaction History");
            System.out.println("4. Transfer Money");
            System.out.println("5. Apply for Loan");
            System.out.println("6. Exit Customer Menu");

            int customerChoice = sc.nextInt();
            sc.nextLine();

            switch (customerChoice) {
                case 1:
                    
                    
                    System.out.print("Enter new  Name: ");
                    String name = sc.nextLine();
                  AccountDao.updateAccount(a);
                    System.out.println(  "Contact information updated successfully!" );
                    break;
    }
                    
                    }
                    
//                    else if(accountNumber!=acc.getAccountNumber()){
//                        System.out.println("Account number not found ");
//                    }
                    else {
                        System.out.println( "Customer login failed. Please try again.");
                    }
                    
                   
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:

            }
        }
    }
}