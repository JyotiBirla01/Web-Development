import java.util.Scanner;

class Account {

    private int accountNumber;
    private String accountHolder;
    private double balance;

    public Account(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
 
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposite(double amount ){

    }
    
}

class Bank {

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the capacity of account ");
        int capacity = sc.nextInt();
        Bank bank = new Bank();

        while (true) {
            System.out.println("Choose an option ");
            System.out.println(" 1. Add account ");
            System.out.println(" 2. Remove  account ");
            System.out.println(" 3. Deposite  account ");
            System.out.println(" 4. withDraw account ");
            System.out.println(" 5. Display  ");
            System.out.println(" 6. Exit ! ");

            System.out.println("Enter your choice ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the account number ");
                    int accountNumber = sc.nextInt();
                    System.out.println("Enter the account holder name ");
                    String accountHolder = sc.nextLine();
                    System.out.println("Enter the balance ");
                    double balance = sc.nextDouble();
                    break;
                case 2:
                    System.out.println("Enter the account number to remove ");
                    int removeAccountNumber = sc.nextInt();
                    break;

                case 3:

                    System.out.println("Enter account number to deposite ");
                    int depositeAccountNumber = sc.nextInt();
                    System.out.println("Enter the amount to deposite ");
                    double depositeAmount = sc.nextDouble();
                    break;

                case 4:
                    System.out.println("Enter account number to deposite ");
                    int withdrawAccountNumber = sc.nextInt();
                    System.out.println("Enter the amount to deposite ");
                    double withdrawAmount = sc.nextDouble();
                    break;
                case 5:
                    System.out.println("------ data---------------");
                    break;
                case 6:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println(" Invalide Choice ");

            }

        }

    }
}