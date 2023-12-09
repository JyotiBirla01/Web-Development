
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Customer extends Transactions implements Serializable {

    Admin admin = new Admin();
    Scanner sc = new Scanner(System.in);
    static String customer_path = "CustomerDetails.txt";

    private String name;
    private String gender;
    private long mobile;
    private long accountNo;
    private String address;
    private int pin;
    private int age;
    private double balance;
    private String ifscCode;
    private String dob;
    private boolean isBlocked;
    private String acc_Type;
    private long adhar_num;
    private String pan_num;
    private boolean isLoaned;
    private List<Transactions> transactionhistory;
    // private LocalDateTime deposit = new LocalDateTime();
    // private LocalDateTime withdraw = new LocalDateTime();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy   HH:mm:ss");
    // LocalDateTime now = null;
    LocalDateTime accountOpenDate = null;

    public Customer() {

    }

    public Customer(String acc_Type, long adhar_num, String pan_num, boolean isLoaned, String name, String gender,
            long mobile, long accountNo, String address, int pin, int age, double balance, String ifscCode, String dob,
            LocalDateTime accountOpenDate) {
        this.name = name;
        this.gender = gender;
        this.mobile = mobile;
        this.accountNo = accountNo;
        this.address = address;
        this.pin = pin;
        this.age = age;
        this.balance = balance;
        this.ifscCode = ifscCode;
        this.dob = dob;
        this.accountOpenDate = accountOpenDate;
        this.acc_Type = acc_Type;
        this.adhar_num = adhar_num;
        this.pan_num = pan_num;
        this.isLoaned = isLoaned;
        transactionhistory = new ArrayList<>();
        this.isBlocked = false;
    }

    public boolean getIsBlocked() {
        return isBlocked;
    }

    public void setIsBlocked(boolean isActive) {
        this.isBlocked = isActive;
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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
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
        return isBlocked = true;
    }

    public boolean unblock() {
        return isBlocked = false;

    }

    public String getAcc_Type() {
        return acc_Type;
    }

    public void setAcc_Type(String acc_Type) {
        this.acc_Type = acc_Type;
    }

    public long getAdhar_num() {
        return adhar_num;
    }

    public void setAdhar_num(long adhar_num) {
        this.adhar_num = adhar_num;
    }

    public String getPan_num() {
        return pan_num;
    }

    public void setPan_num(String pan_num) {
        this.pan_num = pan_num;
    }

    public boolean isIsLoaned() {
        return isLoaned;
    }

    public void setIsLoaned(boolean isLoaned) {
        this.isLoaned = isLoaned;
    }

    public List<Transactions> getTransactionhistory() {
        return transactionhistory;
    }

    public void setTransactionhistory(List<Transactions> transactionhistory) {
        this.transactionhistory = transactionhistory;
    }

    public DateTimeFormatter getDtf() {
        return dtf;
    }

    public void setDtf(DateTimeFormatter dtf) {
        this.dtf = dtf;
    }

    public LocalDateTime getAccountOpenDate() {
        return accountOpenDate;
    }

    public void setAccountOpenDate(LocalDateTime accountOpenDate) {
        this.accountOpenDate = accountOpenDate;
    }

    // ------------------------------ READ CUSTOMER
    // OBJECT--------------------------------------------------
    public Object readObjectFromFile(File f) {
        Customer cus = null;
        try {

            FileInputStream fos = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fos);
            cus = (Customer) (ois.readObject());
            fos.close();
            ois.close();
        } catch (Exception e) {
            System.out.println("Cannot read Object");

        }
        return cus;
    }
    // ------------------------------------------------ CUSTOMER HOME
    // PAGE----------------------------------------------------------------

    public void customerLogin(int account_num, int PIN) {
        String filePath = customer_path + account_num + ".txt";
        File f = new File(filePath);
        if (!f.exists()) {
            System.out.println("Customer does Not exists...................");
        } else {
            Customer customer = (Customer) (readObjectFromFile(f));
            if (customer.getAccountNo() == account_num && customer.getPin() == PIN) {
                System.out.println("\n\n\t\t\t++++++++WEL-COME++++++++++++++++++");
                System.out.println("\n\n \t\t\t " + customer.getName().toUpperCase());
                System.out.println(" \n Select Functionality : ");
                System.out.println("View Account Details : ---------------------------------1");
                System.out.println("Apply for Loan : ----------------------------------------2");
                System.out.println("Repay Loan : -------------------------------------------3");
                System.out.println("Transfer Money: ----------------------------------------4");
                System.out.println("Withdrawal Money  : -----------------------------------5");
                System.out.println("Deposit Money : ----------------------------------------6");
                System.out.println("Transaction History : -----------------------------------7");
                System.out.println("Exit -------------------------------------------------------8");

                int ch = sc.nextInt();

                switch (ch) {
                    case 1:
                        System.out.println("Enter Customer Account NUmber :");
                        account_num = sc.nextInt();
                        System.out.println("Enter Customer name ");
                        admin.viewParticularAccount(account_num, name);
                        break;
                    case 2:

                        getApplyForLoan();
                        break;
                    case 3:

                        break;
                    case 4:
                        System.out.println("Enter Recipient Account Number : ");
                        account_num = sc.nextInt();
                        System.out.println("Enter Amount to Transfer : ");
                        double amount = sc.nextDouble();
                        getTransferMoney(account_num, amount);
                        break;
                    case 5:
                        System.out.println("Enter Amount to Withdrawal : ");
                        amount = sc.nextDouble();
                        getWithdrawal(amount);
                        break;
                    case 6:
                        System.out.println("Enter Amount to Deposit : ");
                        amount = sc.nextDouble();
                        getDeposit(amount);
                        break;
                    case 7:
                        getTransactionHistory();
                        break;
                    case 8:
                        System.out.println("\n\n\t+++++++++++++++ THANK YOU VISIT AGAIN ++++++++++++++++++++++");
                        break;
                    default:
                        throw new AssertionError();
                }
            } else {
                System.out.println("Invalid Account Number and PIN : ");
            }

        }

    }
    // -----------------------------------------------------------------APPLY FOR
    // LOAN-------------------------------------------

    public void getApplyForLoan() {
        System.out.print("Enter the your salary:");
        int salary = sc.nextInt();
        System.out.print("Enter the Amount for loan: ");
        double loanAmount = sc.nextDouble();
        System.out.print("Enter the Duration(number of years) of loan:");
        int Duration = sc.nextInt();
        double Interest = (loanAmount * 12) / 100;
        double m = Duration * 12;
        double emi = (loanAmount + Interest) / m;
        System.out.println("your loan monthly EMI: " + emi);
        if ((age >= 21 && age <= 57) && (loanAmount >= 5000 && loanAmount <= 500000) && emi < salary) {
            System.out.println("++++++++++++++++LOAN IS SUCCESSFULLY PASSED...++++++++++++++++++++++ ");
        } else {
            System.out.println("\t++++++++++++++++++++++++LOAN IS FAILED +++++++++++++++++++++++");
        }

    }
    // --------------------------------------------------------------CREATE NEW
    // CUSTOMER --------------------------------------------

    public void createNewCustomer() {

        Random random = new Random();
        try {
            System.out.println("Enter Account Type (Saving /Current)  : ");
            acc_Type = sc.nextLine();
            System.out.println("Enter Customer Aadhar Number : ");
            adhar_num = sc.nextLong();
            System.out.println("Enter Customer  Pan Number :");
            pan_num = sc.nextLine();
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
            balance = sc.nextDouble();

            accountNo = random.nextInt(1000000000);
            pin = random.nextInt(10000);
            accountOpenDate = LocalDateTime.now();
            System.out.println("\n\n\t]\t\t\tCongratulations ..... Your Account Has Generated Successfully.....");
            System.out.println("\n\n\t\tYour Account Number and PIN has Genrated Successfully............");
            System.out.println("To View Your Account Number And PIN confirm bank Password :");
            String pass = sc.next();
            if (pass.equals("bank123")) {
                try {
                    String fileName = Long.toString(accountNo) + ".txt";
                    FileOutputStream fos = new FileOutputStream(customer_path + fileName);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    Customer customer = new Customer(acc_Type, adhar_num, pan_num, false, name, gender, mobile,
                            accountNo, address, pin, age, balance, ifscCode, dob, accountOpenDate);

                } catch (Exception e) {
                    System.out.println("Exception occured cant create account named file ....");
                }

                System.out.println("Your Accout Number is : " + accountNo);
                System.out.println("Your Accout PIN Number is : " + pin);
                System.out.println(" \n\n ==============THANK YOU=========================");
            }
        } catch (Exception e) {
            System.out.println("Invalid Entry...... Please [TRY AGAIN].");

        }
    }

    // -------------------------------------------------------TRANSFER
    // MONEY-----------------------------------------------------------------
    public void getTransferMoney(int account_num, double amount) {
        String filePath = customer_path + account_num + ".txt";
        File f = new File(filePath);
        if (!f.exists()) {
            System.out.println("Invalid Account Number : ");
        } else {
            Customer customer = (Customer) readObjectFromFile(f);
            if (this.balance > amount && !this.isBlocked && !customer.isBlocked) {
                this.balance -= amount;
                customer.balance += amount;
                super.transactionDateTime = LocalDateTime.now();
                transactionhistory.add(new Transactions("-MONEY TRANFERED TO -" + customer.getName(), amount, balance,
                        transactionDateTime));
                System.out.println("+++++++++++++++++++Amount Transfered Successfully : +++++++++++++++++++++");
            } else {
                System.out.println(
                        "++++++++++++++++++++++++ INSUFFICIENT BALANCE OR ACCOUNT IS BLOCKED +++++++++++++++++++++++++++");
            }
        }

    }

    // -----------------------------------------------------------WITHDRAWAL
    // MONEY---------------------------------------------------
    public void getWithdrawal(double amount) {
        if (this.balance > amount && !this.isBlocked) {
            this.balance -= amount;
            super.transactionDateTime = LocalDateTime.now();
            transactionhistory.add(new Transactions("-Deposit-", amount, balance, transactionDateTime));
            System.out.println(
                    "----------------------------------------------------Withdrawal Successfull-------------------------------------------------------");
        } else {
            System.out.println("++++++++++++++++++++++++++ INSUFFICIENT BALANCE ++++++++++++++++++++++++++");
        }

    }

    // --------------------------------------------------------------DEPOSIT
    // MONEY---------------------------------------------
    public void getDeposit(double amount) {
        if (!this.isBlocked) {
            this.balance += amount;
            super.transactionDateTime = LocalDateTime.now();
            transactionhistory.add(new Transactions("-Deposit-", amount, balance, transactionDateTime));
            System.out.println(
                    "----------------------------------------------------Deposit Successfull-------------------------------------------------------");
        } else {
            System.out.println("++++++++++++++++++++++++++ INSUFFICIENT BALANCE ++++++++++++++++++++++++++");
        }

    }

    // --------------------------------------------------------------TRANSACTION
    // HISTORY-------------------------------------------------------
    public void getTransactionHistory() {
        String filePath = customer_path + this.accountNo + ".txt";
        File f = new File(filePath);
        if (f.exists()) {
            Customer customer = (Customer) readObjectFromFile(f);
            List<Transactions> list = customer.getTransactionhistory();
            System.out.println("++++++++++ TRANSACTION HISTORY ++++++++++++++");
            for (Transactions transactions : list) {
                System.out.println("\n\n Description   : " + transactions.getDescription());
                System.out.println(" Amount        :" + transactions.getAmount());
                System.out.println("Balance Left   : " + transactions.getLeftBalance());
                System.out.println(" Time Stamp  :" + transactions.getTransactionDateTime());

            }
        }
    }
}
