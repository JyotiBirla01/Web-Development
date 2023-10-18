/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// package com.mycompany.bankmanagementsystem;

// import com.sun.org.apache.bcel.internal.generic.D2F;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Customers implements Serializable {

    private String name;
    private String gender;
    private long mobile;
    private long accountNo;
    private String address;
    private int pin;
    private int age;
    private double amt;
    private String ifscCode;
    private String dob;
    private boolean isActive;
    // private LocalDateTime deposit = new LocalDateTime();
    // private LocalDateTime withdraw = new LocalDateTime();

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy   HH:mm:ss");
    LocalDateTime now = null;
    LocalDateTime accountOpen = null;

    public Customers() {

    }

    public Customers(String name, String gender, long mobile, long accountNo, String address, int pin, int age,
            double amt, String ifscCode, String dob, LocalDateTime accountOpen) {
        this.name = name;
        this.gender = gender;
        this.mobile = mobile;
        this.accountNo = accountNo;
        this.address = address;
        this.pin = pin;
        this.age = age;
        this.amt = amt;
        this.ifscCode = ifscCode;
        this.dob = dob;
        this.accountOpen = accountOpen;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public String getAccountOpen() {
        return dtf.format(now);
    }

    public void setAccountOpen(LocalDateTime accountOpen) {
        this.accountOpen = accountOpen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAmt() {
        return amt;
    }

    public void setAmt(double amt) {
        this.amt = amt;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    // public Date getDeposit() {
    // return deposit;
    // }
    //
    // public void setDeposit(Date deposit) {
    // this.deposit = deposit;
    // }
    //
    // public Date getWithdraw() {
    // return withdraw;
    // }
    // public void setWithdraw(Date withdraw) {
    // this.withdraw = withdraw;
    // }
    public boolean block() {
        return isActive = true;
    }

    public boolean unblock() {
        return isActive = false;

    }

    public void createNewCustomer() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        try {
            System.out.println("Enter Customer Name : ");
            name = sc.nextLine();
            System.out.println("Enter Customer Age : ");
            age = sc.nextInt();
            System.out.println("Enter Customer Mobile Number  : ");
            mobile = sc.nextLong();
            System.out.println("Enter Customer Gender  : ");
            gender = sc.nextLine();
            System.out.println("Enter Customer IFSC code  : ");
            ifscCode = sc.nextLine();
            System.out.println("Enter Customer Address : ");
            address = sc.nextLine();
            System.out.println("Enter Customer DOB : ");
            dob = sc.nextLine();
            System.out.println("Enter Account Opening  Amount : ");
            amt = sc.nextDouble();

            accountNo = random.nextInt(1000000000);
            pin = random.nextInt(10000);
            accountOpen = LocalDateTime.now();
            System.out.println("\n\n\t]\t\t\tCongratulations ..... Your Account Has Generated Successfully.....");
            System.out.println("\n\n\t\tYour Account Number and PIN has Genrated Successfully............");
            System.out.println("To View Your Account Number And PIN confirm bank Password :");
            String pass = sc.next();
            if (pass.equals("bank123")) {
                try {
                    String fileName = Long.toString(accountNo) + ".txt";
                    FileOutputStream fos = new FileOutputStream(fileName);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    BakApp cus = new BakApp(name, gender, mobile, accountNo, address, pin, age, amt, ifscCode, dob,
                            accountOpen);

                } catch (Exception e) {
                    System.out.println("Exception occured cant create account named file ....");
                }

                System.out.println("Your Accout Number is : " + accountNo);
                System.out.println("Your Accout PIN Number is : " + pin);
                System.out.println(" \n\n ==============THANK YOU=========================");
            }
        } catch (Exception e) {
            System.out.println("Invalid Entry...... Please [TRY AGAIN].");
            createNewCustomer();
        }

    }

    public void viewAllCustomers() {
        

    }

    public void viewParticularCustomer(Scanner sc ) {
        System.out.println("Enter the account number");
      long   accountNumber =sc.nextLong();
        if(accountNo==accountNumber){


        }

    }
}
