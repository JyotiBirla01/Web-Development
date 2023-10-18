import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

// Define a Transaction class to represent individual banking transactions
class Transaction {
    private String description;
    private double amount;
    private Date timestamp;

    // Constructor for initializing transaction details
    public Transaction(String description, double amount) {
        this.description = description;
        this.amount = amount;
        this.timestamp = new Date();
    }

    // Getter method for transaction description
    public String getDescription() {
        return description;
    }

    // Getter method for transaction amount
    public double getAmount() {
        return amount;
    }

    // Getter method for formatting and getting the timestamp of the transaction
    public String getTimestamp() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(timestamp);
    }
}

// Define a Customer class to represent bank customers
class Customer {
    // Customer attributes
    private String username;
    private String password;
    private String name;
    private String contact;
    private double balance;
    private boolean isBlocked;
    private List<Transaction> transactionHistory;
    private double loanBalance;

    // Constructor for initializing customer details
    public Customer(String username, String password, String name, String contact, double balance) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.contact = contact;
        this.balance = balance;
        this.isBlocked = false;
        this.transactionHistory = new ArrayList<>();
        this.loanBalance = 0;
    }

    // Getter method for customer username
    public String getUsername() {
        return username;
    }

    // Getter method for customer password (not recommended in real applications)
    public String getPassword() {
        return password;
    }

    // Getter method for customer name
    public String getName() {
        return name;
    }

    // Getter method for customer contact information
    public String getContact() {
        return contact;
    }

    // Getter method for customer balance
    public double getBalance() {
        return balance;
    }

    // Getter method to check if the customer is blocked
    public boolean isBlocked() {
        return isBlocked;
    }

    // Method to update customer contact information
    public void updateContact(String newContact) {
        contact = newContact;
    }

    // Method to deposit money into the customer's account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            recordTransaction("Deposit", amount);
        }
    }

    // Method to withdraw money from the customer's account
    public boolean withdraw(double amount) {
        if (!isBlocked && amount > 0 && balance >= amount) {
            balance -= amount;
            recordTransaction("Withdrawal", -amount);
            return true;
        }
        return false;
    }

    // Method to block the customer's account
    public void block() {
        isBlocked = true;
    }

    // Method to unblock the customer's account
    public void unblock() {
        isBlocked = false;
    }

    // Method to transfer money from the customer to another recipient
    public void transferMoney(Customer recipient, double amount) {
        if (!isBlocked && amount > 0 && balance >= amount) {
            balance -= amount;
            recipient.deposit(amount);
            recordTransaction("Transfer to " + recipient.getUsername(), -amount);
            recipient.recordTransaction("Received from " + getUsername(), amount);
        }
    }

    // Method for a customer to apply for a loan
    public void applyForLoan(double amount) {
        if (!isBlocked && amount > 0 && loanBalance == 0) {
            loanBalance += amount;
            balance += amount;
            recordTransaction("Loan Received", amount);
        }
    }

    // Method for a customer to repay a loan
    public void repayLoan(double amount) {
        if (!isBlocked && amount > 0 && loanBalance > 0) {
            loanBalance -= amount;
            balance -= amount;
            recordTransaction("Loan Repayment", -amount);
        }
    }

    // Method to print the transaction history of a customer
    public void printTransactionHistory() {
        System.out.println("Transaction History:");
        for (Transaction transaction : transactionHistory) {
            System.out.println("Description: " + transaction.getDescription());
            System.out.println("Amount: $" + transaction.getAmount());
            System.out.println("Timestamp: " + transaction.getTimestamp());
            System.out.println();
        }
    }

    // Method to record a transaction in the customer's transaction history
    private void recordTransaction(String description, double amount) {
        Transaction transaction = new Transaction(description, amount);
        transactionHistory.add(transaction);
    }

    // Method to convert customer data to a string for file storage
    public String toFileString() {
        return username + "," + password + "," + name + "," + contact + "," + balance + "," + isBlocked + ","
                + loanBalance;
    }

    // Setter method for blocking/unblocking a customer
    public void setBlocked(boolean isBlocked2) {
        isBlocked = isBlocked2;
    }
}
