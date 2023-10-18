class BankAccount {
    int accountNumber;
    String name;
    double balance;
    String branch;

    BankAccount(int accountNumber, String name, double balance, String branch) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.branch = branch;
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: $" + balance);
        System.out.println("Branch: " + branch);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
        displayAccountDetails();
    }

    void withdraw(double amount) {
        if (balance - amount < (branch.equals("saving") ? 5000 : 1000)) {
            System.out.println("Insufficient balance for withdrawal.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            displayAccountDetails();
        }
    }
}

class BankMain {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1, "John Doe", 7000, "saving");
        BankAccount account2 = new BankAccount(2, "Jane Smith", 15000, "current");

        account1.displayAccountDetails();
        account1.deposit(1000);
        account1.withdraw(2000);

        account2.displayAccountDetails();
        account2.withdraw(12000);
        account2.deposit(3000);

        double totalDeposits = account1.balance + account2.balance;
        System.out.println("Total Money Deposited in the Bank: $" + totalDeposits);
    }
}
