
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import javax.annotation.processing.Filer;

public class Admin implements Serializable {

    static String admin_path = "AdminDetails.txt";

    private static final String admin_password = "bank123";
    private int pin;
    private String name;
    private String gender;
    private long mobile;
    private Date joiningDate = new Date();

    public Admin() {
    }

    public Admin(int pin, String name, String gender, long mobile) {
        this.pin = pin;
        this.name = name;
        this.gender = gender;
        this.mobile = mobile;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
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

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    // --------------------------------------------------------------EMPLOYEE----------------------------------------------------------------
    public void employee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t\t\tEmployee Registration----------1");
        System.out.println("\t\t\t\t\tEmployee Login-----------------2");
        System.out.println("\t\t\t\t\tExit-------------------------------3");
        System.out.print("\t\t\t\t\t\tPlease Enter : ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                empRegistraion();
                break;
            case 2:
                System.out.print("Enter  the Employee Mobile Number :");
                long mobile = sc.nextLong();
                System.out.print("\nEnter  the Employee PIN Number :");
                int pin = sc.nextInt();
                empLogin(mobile, pin);
                break;
            case 3:
                System.exit(ch);
            default:
                System.out.println("Invalid Entry");
                // break;

        }
    }

    // -------------------------------------------------------EMPLOYEE
    // REGISTRATION------------------------------------------------------------
    public void empRegistraion() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Name :  ");
        name = sc.nextLine();
        System.out.println("Enter Employee Gender[M/F] :  ");
        gender = sc.next();
        System.out.println("Enter Employee Mobile Number :  ");
        mobile = sc.nextLong();
        int a = random.nextInt(10000);
        pin = a;
        String fileName = Integer.toString(pin) + ".txt";
        String path = "C:\\Users\\DELL\\OneDrive\\Documents\\NetBeansProjects\\BankManagementSystem\\AdminDetails\\";
        try {
            File f = new File(path + fileName);
            if (!f.exists()) {
                f.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(f, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Admin admin = new Admin(pin, name, gender, mobile);
            oos.writeObject(admin);
            oos.close();

        } catch (Exception e) {
            e.printStackTrace();

        }
        System.out
                .println("Your Account has been created successfully  please confirm admin password to view the pin :");
        System.out.print("Enter admin password");
        String pass1 = sc.nextLine();
        String pass = sc.nextLine();

        if (pass.equals(admin_password)) {
            System.out.println("Congratulations your account is successfully created.....");
            System.out.println("Pin to your  account  is : " + pin);

        } else {
            System.out.print("Incorrect Password [Try Again]  : ");
            // pass = sc.nextLine();

        }

    }

    public void empLogin(long mobile, int pin) {

        String fileName = admin_path + Integer.toString(pin) + ".txt";
        try {
            File f = new File(fileName);
            if (!f.exists()) {
                System.out.println("Invalid pin ");
            } else {
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);
                Admin admin = (Admin) ois.readObject();
                if (admin.getMobile() == mobile && admin.getPin() == pin) {
                    System.out.println("----------------------Login Successfull ------------------");
                    System.out.println("Welcome :     " + admin.getName());
                    adminOperation();

                }
            }
        } catch (Exception e) {
            // System.out.println("Cant find Emp.....");
            e.printStackTrace();
        }
    }

    // -----------------------------------------------------------ADMIN
    // OPERATION-------------------------------------------------------------

    public void adminOperation() {
        Customer cus = new Customer();
        System.out.println("Create new customer account : -------------------------------1");
        System.out.println(" View all customers : ------------------------------------------2");
        System.out.println(" View particular customers :  ----------------------------------3");
        System.out.println(" Delete particular account: ------------------------------------4 ");
        System.out.println(" Block particular account :  ------------------------------------5");
        System.out.println(" Unblock particular account : ---------------------------------6 ");
        System.out.println(" Exit : -----------------------------------------------------------7 ");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                cus.createNewCustomer();
                break;
            case 2:
                viewAllCustomer();
                break;
            case 3:
                System.out.println("Enter Customer Account Number : ");
                int account_num = sc.nextInt();
                System.out.println("Enter Customer Name : ");
                String name = sc.nextLine();
                viewParticularAccount(account_num, name);
                break;
            case 4:
                System.out.println("Enter Customer Account Number : ");
                account_num = sc.nextInt();
                getDeleteParticular(account_num);
                break;
            case 5:
                System.out.println("Enter Account Number to Block Account :");
                account_num = sc.nextInt();
                getBlockParticular(account_num);
                break;
            case 6:
                System.out.println("Enter Account Number to UnBlock Account :");
                account_num = sc.nextInt();
                getUnBlockParticular(account_num);
                break;
            case 7:
                System.out.println("++++++++++++++ THANK YOU +++++++++++++++++++++++");
                System.out.println("\n\n ===========VISIT AGAIN=========================");
            default:
                throw new AssertionError();
        }
    }

    // -----------------------------------------------------------READ
    // OBJECT-------------------------------------------------------------
    public Object readObjectFromFile(File f) {
        Customer cus = null;
        try {
            // File f = new File(filepath);
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
    // ---------------------------------------------------------VIEW ALL
    // CUSTOMER----------------------------------------------------------------------

    public void viewAllCustomer() {
        try {
            File dir = new File(Customer.customer_path);
            if (dir.isDirectory()) {

                File f[] = dir.listFiles();
                System.out.println("==============ALL CUSTOMER DETAILS=============================");

                for (File file : f) {
                    Customer customer = (Customer) readObjectFromFile(file);
                    System.out.println(" Customer Name : " + customer.getName());
                    System.out.println(" Customer Age : " + customer.getAge());
                    System.out.println(" Customer Account Type : " + customer.getAcc_Type());
                    System.out.println(" Customer Account Open Date : " + customer.getAccountOpenDate());
                    System.out.print(" Customer Account Status : ");
                    if (customer.getIsBlocked()) {
                        System.out.print("Account is Not Blocked");
                        System.out.println();
                    } else {
                        System.out.print("Account is Blocked");
                        System.out.println();
                    }

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // ------------------------------------------------------------------ VIEW
    // PARTICULAR
    // ACCOUNT------------------------------------------------------------------------

    public void viewParticularAccount(int account_num, String name) {
        String filePath = Customer.customer_path + Integer.toString(account_num) + "txt";
        File f = new File(filePath);
        if (!f.exists()) {
            System.out.println(" Sorry.......    Customer does not exists................");
        } else {
            Customer customer = (Customer) readObjectFromFile(f);
            System.out.println(" Customer Name : " + customer.getName());
            System.out.println(" Customer Age : " + customer.getAge());
            System.out.println(" Customer Account Type : " + customer.getAcc_Type());
            System.out.println(" Customer Account Open Date : " + customer.getAccountOpenDate());
            System.out.print(" Customer Account Status : ");
            if (customer.getIsBlocked()) {
                System.out.print("Account is Not Blocked");
                System.out.println();
            } else {
                System.out.print("Account is Blocked");
                System.out.println();
            }
            System.out.println(" Customer Aadhar Number : " + customer.getAdhar_num());
            System.out.println(" Customer  Pan Number :" + customer.getPan_num());
            System.out.println(" Customer Mobile Number  : " + customer.getMobile());
            System.out.println(" Customer Gender  : " + customer.getGender());
            System.out.println(" Customer IFSC code  : " + customer.getIfscCode());
            System.out.println(" Customer Address : " + customer.getAddress());
            System.out.println(" Customer DOB : " + customer.getDob());
            System.out.println("Enter Account Opening  Amount : " + customer.getBalance());

        }
    }

    // --------------------------------------------DELETE
    // ACCOUNT--------------------------------------------------------------
    public void getDeleteParticular(int account_num) {
        String filePath = Customer.customer_path + Integer.toString(account_num) + ".txt";
        File f = new File(filePath);
        if (f.exists()) {
            f.delete();
        }

    }

    // -------------------------------------------------------BLOCK
    // ACCOUNT-------------------------------------------------------
    public void getBlockParticular(int account_num) {
        String filePath = Customer.customer_path + Integer.toString(account_num) + ".txt";
        File f = new File(filePath);
        if (!f.exists()) {
            System.out.println("Customer does not exists....................");

        } else {
            Customer customer = (Customer) readObjectFromFile(f);
            customer.setIsBlocked(true);
        }
    }

    // -----------------------------------------------------------UNBLOCK
    // ACCOUNT------------------------------------------------
    public void getUnBlockParticular(int account_num) {
        String filePath = Customer.customer_path + Integer.toString(account_num) + ".txt";
        File f = new File(filePath);
        if (!f.exists()) {
            System.out.println("Customer does not exists....................");

        } else {
            Customer customer = (Customer) readObjectFromFile(f);
            customer.setIsBlocked(false);
        }
    }
}
