
/*16)  Create a program that helps banks to maintain records. It should have following facilities.
Anybody can create current or saving account with following initial information:account number,
 name, balance, and branch.
display account detail for a particular accounts.
display total money deposited in bank.
allow deposit and withdrawal in an account .
for saving account opening balance and minimum balance must be 5000.
for current account opening balance and minimum balance must be 1000.
can not withdraw the amount from the account that makes balance less than the minimum balance.
 */
import java.util.Scanner;

class Bank {
    private int accountNumber;
    private String name;
    private double balance;
    private String branch;
    protected double tolDeposite;
    protected double totalDeposit;

    public Bank() {

    }

    public Bank(int accountNumber, String name, double balace, String branch) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balace;
        this.branch = branch;
        this.tolDeposite += balace;
        this.totalDeposit += tolDeposite;

    }

    public void display() {
        System.out.println("Account Number " + accountNumber + "\t\t\tName " + name + "\t\t\tBalance " + tolDeposite
                + "\t\t\t Branch Name " + branch);
    }

    public void deposit(double amount) {
        this.tolDeposite += amount;
        this.totalDeposit += amount;
        System.out.println("Deposite is succesfully ");
        System.out.println("total deposite money : " + amount);
    }

}

class SavingAccount extends Bank {
    private int min= 5000;
    public SavingAccount() {

    }

    public SavingAccount(int accountNumber, String name, double balance, String branch) {
        super(accountNumber, name, balance, branch);
    }
public void withDraw(double amount) {
        if (this.tolDeposite >= amount + min) {
            this.tolDeposite -= amount;
            System.out.println(" withdraw is succesfully");
            System.out.println(" Total withdraw money " + amount);
        } else {

            System.out.println(" Insufficient balance ");
        }
    }
}

class CurrentAccount extends Bank {
    private int min = 1000;

    public CurrentAccount() {

    }

    public CurrentAccount(int accountNumber, String name, double balance, String branch) {
        super(accountNumber, name, balance, branch);
    }

    public void withDraw(double amount) {
        if (this.tolDeposite >= amount + min) {
            this.tolDeposite -= amount;
            System.out.println(" withdraw is succesfully");
            System.out.println(" Total withdraw money " + amount);
        } else {

            System.out.println(" Insufficient balance ");
        }
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account number  ");
        int accountNumber = sc.nextInt();
        System.out.println("Enter the name");
        String name = sc.nextLine();
        System.out.println("Enter the balance");
        double balance = sc.nextFloat();
        System.out.println("Enter the branch name");
        String branch = sc.nextLine();
        System.out.println("Enter the choice \n1. Current Account \n 2. Saving account ");
        if (1000 <= balance)
            System.out.println(" Congratulation!!! your current account is open");

        else
            System.out.println("Your balance is less ,please your balance should be atleast 1000");
        Bank obj = new CurrentAccount(accountNumber, name, balance, branch);

    }

}
