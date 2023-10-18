import java.io.*;
import java.util.*;

class Bank implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<Customer> customers = new ArrayList<>();
    private List<Admin> admins = new ArrayList<>();

    // Methods to manage customers
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public List<Customer> getAllCustomers() {
        return customers;
    }

    public Customer getCustomerByAccountNumber(int accountNumber) {
        for (Customer customer : customers) {
            if (customer.getAccountNumber() == accountNumber) {
                return customer;
            }
        }
        return null;
    }

    public void removeCustomer(int accountNumber) {
        customers.removeIf(customer -> customer.getAccountNumber() == accountNumber);
    }

    // Methods to manage admins
    public void addAdmin(Admin admin) {
        admins.add(admin);
    }

    public List<Admin> getAllAdmins() {
        return admins;
    }
}

class Customer implements Serializable {
    private static final long serialVersionUID = 1L;
    private int accountNumber;
    private String name;
    private double balance;
    private List<Transaction> transactionHistory = new ArrayList<>();

    public Customer(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    // Getter methods
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        transactionHistory.add(new Transaction("Deposit", amount));
    }

    // Withdraw method
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (balance >= amount) {
            balance -= amount;
            transactionHistory.add(new Transaction("Withdraw", amount));
        } else {
            throw new InsufficientBalanceException("Insufficient balance");
        }
    }

    // Other methods
    // ...
}

class Admin implements Serializable {
    private static final long serialVersionUID = 1L;
    private String username;
    private String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getter methods
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // Other methods
    // ...
}

class Transaction implements Serializable {
    private static final long serialVersionUID = 1L;
    private String type;
    private double amount;
    private Date timestamp;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.timestamp = new Date();
    }

    // Getter methods
    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    // Other methods
    // ...
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

 class BankManagementSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        // Ask for admin credentials
        System.out.print("Enter Admin Username: ");
        String adminUsername = scanner.nextLine();
        System.out.print("Enter Admin Password: ");
        String adminPassword = scanner.nextLine();

        // Dummy data for demonstration
        Admin admin = new Admin(adminUsername, adminPassword);
        bank.addAdmin(admin);

        try {
            System.out.print("Enter Customer Account Number: ");
            int accountNumber = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Enter Customer Name: ");
            String customerName = scanner.nextLine();

            System.out.print("Enter Initial Customer Balance: ");
            double initialBalance = scanner.nextDouble();

            // Create a new customer
            Customer customer = new Customer(accountNumber, customerName, initialBalance);
            bank.addCustomer(customer);

            // Serialization: Save bank data to a file
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("bankdata.ser"))) {
                oos.writeObject(bank);
                System.out.println("Bank data saved.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }

        // Deserialization: Load bank data from a file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("bankdata.ser"))) {
            Bank loadedBank = (Bank) ois.readObject();
            System.out.println("Bank data loaded.");

            // You can perform operations on the loaded bank object here
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Close the scanner
        scanner.close();
    }
}









                            