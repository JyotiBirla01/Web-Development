
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

class Transaction {
    private String description;
    private double amount;

    public Transaction(String description, double amount) {
        this.description = description;
        this.amount = amount;

    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public String getTimestamp() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public void writeToFile() throws IOException {

        String fileName = "transaction.txt";
        File f = new File(fileName);
        if (!f.exists())
            f.createNewFile();
        try (FileWriter writer = new FileWriter(fileName, true)) {

            String transactionRecord = getTimestamp() + "," + description + "," + amount;
            writer.write(transactionRecord + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Customer {
    private String username;
    private String password;
    private String name;
    private String contact;
    private double balance;
    private boolean isBlocked;
    private List<Transaction> transactionHistory;
    private double loanBalance;

    public static final String RESET = "\u001B[0m";
    public static final String YELLOW = "\u001B[33m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";

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

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void updateContact(String newContact) {
        contact = newContact;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            recordTransaction("Deposit", amount);
        }
    }

    public boolean withdraw(double amount) {
        if (!isBlocked && amount > 0 && balance >= amount) {
            balance -= amount;
            recordTransaction("Withdrawal", amount);
            return true;
        }
        return false;
    }

    public void block() {
        isBlocked = true;
    }

    public void unblock() {
        isBlocked = false;
    }

    public void transferMoney(Customer recipient, double amount) {
        if (!isBlocked && amount > 0 && balance >= amount) {
            balance -= amount;
            recipient.deposit(amount);
            recordTransaction("Transfer to " + recipient.getUsername(), amount);
            recipient.recordTransaction(PURPLE + "Received from " + RESET + getUsername(), amount);
        }
    }

    public void applyForLoan(double amount) {
        if (!isBlocked && amount > 0 && loanBalance == 0) {
            loanBalance += amount;
            balance += amount;
            recordTransaction(GREEN + "Loan Received" + RESET, amount);
        }
    }

    public void repayLoan(double amount) {
        if (!isBlocked && amount > 0 && loanBalance > 0) {
            loanBalance -= amount;
            balance -= amount;
            recordTransaction(GREEN + "Loan Repayment" + RESET, amount);
        }
    }

    public void printTransactionHistory() {
        System.out.println(PURPLE + "\nTransaction History:" + RESET);
        for (Transaction transaction : transactionHistory) {
            System.out.println("Description: " + transaction.getDescription());
            System.out.println("Amount:  Rs. " + transaction.getAmount());
            System.out.println("Timestamp: " + transaction.getTimestamp());
            System.out.println();
        }
    }

    public void recordTransaction(String description, double amount) {
        Transaction transaction = new Transaction(description, amount);
        transactionHistory.add(transaction);
    }

    public String toFileString() {
        return username + "," + password + "," + name + "," + contact + "," + balance + "," + isBlocked
                + ","
                + loanBalance;
    }

    public void setBlocked(boolean isBlocked2) {
    }
}

class CustomerManager {
    private static final int MAX_CUSTOMERS = 100;
    private Customer[] customers;
    private int customerCount;
    private static final String CUSTOMER_FILE = "customers.txt";
    public static final String RESET = "\u001B[0m";
    public static final String YELLOW = "\u001B[33m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String BLACK = "\u001B[30m";

    public CustomerManager() {
        customers = new Customer[MAX_CUSTOMERS];
        customerCount = 0;
        loadCustomersFromFile();
    }

    private void loadCustomersFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(CUSTOMER_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 7) {
                    Customer customer = new Customer(data[0], data[1], data[2], data[3], Double.parseDouble(data[4]));
                    customer.block();
                    customer.applyForLoan(Double.parseDouble(data[6]));
                    customers[customerCount++] = customer;
                } else if (data.length == 6) {
                    Customer customer = new Customer(data[0], data[1], data[2], data[3], Double.parseDouble(data[4]));
                    boolean isBlocked = Boolean.parseBoolean(data[5]);
                    customer.setBlocked(isBlocked);
                    customers[customerCount++] = customer;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createCustomer(String username, String password, String name, String contact, double balance) {
        if (customerCount < MAX_CUSTOMERS) {
            Customer newCustomer = new Customer(username, password, name, contact, balance);
            customers[customerCount++] = newCustomer;
            saveCustomersToFile();
        } else {
            System.out.println(RED + "Cannot create a new customer. Maximum limit reached." + RESET);
        }
    }

    public Customer[] getAllCustomers() {
        Customer[] allCustomers = new Customer[customerCount];
        System.arraycopy(customers, 0, allCustomers, 0, customerCount);
        return allCustomers;
    }

    private void saveCustomersToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CUSTOMER_FILE))) {
            for (int i = 0; i < customerCount; i++) {
                writer.write(customers[i].toFileString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Customer getCustomerByUsername(String usernameToFind) {
        for (int i = 0; i < customerCount; i++) {
            if (customers[i].getUsername().equals(usernameToFind)) {
                return customers[i];
            }
        }
        return null;
    }

    public void blockCustomer(String username

    ) {
        for (int i = 0; i < customerCount; i++) {
            if (customers[i].getUsername().equals(username)) {
                customers[i].block();
                saveCustomersToFile();
                return;
            }
        }
    }

    public void unblockCustomer(String username) {
        for (int i = 0; i < customerCount; i++) {
            if (customers[i].getUsername().equals(username)) {
                customers[i].unblock();
                saveCustomersToFile();
                return;
            }
        }
    }

    public boolean transferMoney(String senderUsername, String recipientUsername, double amount) {
        Customer sender = getCustomerByUsername(senderUsername);
        Customer recipient = getCustomerByUsername(recipientUsername);

        if (sender != null && recipient != null) {
            sender.transferMoney(recipient, amount);
            saveCustomersToFile();
            return true;
        }

        return false;
    }

    // public void applyForLoan(String username, double amount) {
    // Customer customer = getCustomerByUsername(username);
    // if (customer != null) {
    // customer.applyForLoan(amount);
    // saveCustomersToFile();
    // }
    // }
    public void applyForLoan(String username, double amount) {
        Customer customer = getCustomerByUsername(username);
        if (customer != null) {
            customer.applyForLoan(amount);
            customer.recordTransaction(Customer.GREEN + "Loan Received" + Customer.RESET, amount);
            saveCustomersToFile();
        }
    }

    public void repayLoan(String username, double amount) {
        Customer customer = getCustomerByUsername(username);
        if (customer != null) {
            customer.repayLoan(amount);
            saveCustomersToFile();
        }
    }
}

class Admin {
    private static final String ADMIN_USERNAME = "cipher";
    private static final String ADMIN_PASSWORD = "cipher04";
    public static final String RESET = "\u001B[0m";
    public static final String YELLOW = "\u001B[33m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String BLACK = "\u001B[30m";

    public boolean login(String username, String password) {
        return ADMIN_USERNAME.equals(username) && ADMIN_PASSWORD.equals(password);
    }

    public void viewAllCustomerAccounts(CustomerManager customerManager) {
        Customer[] customers = customerManager.getAllCustomers();
        System.out.println(BLUE + "\n\t\tAll Customer Accounts:" + RESET);
        for (Customer customer : customers) {
            System.out.println("Username: " + customer.getUsername() + ", Name: " + customer.getName());
        }
    }

    public Customer viewCustomerAccount(CustomerManager customerManager, String username) {
        return customerManager.getCustomerByUsername(username);
    }

    public void blockCustomerAccount(CustomerManager customerManager, String username) {
        customerManager.blockCustomer(username);
        System.out.println(RED + "Customer account blocked successfully!" + RESET);
    }

    public void createNewAccount(CustomerManager customerManager, String username, String password, String name,
            String contact, double balance) {
        customerManager.createCustomer(username, password, name, contact, balance);
        System.out.println(GREEN + "New customer account created successfully!" + RESET);
    }

    public void unblockCustomerAccount(CustomerManager customerManager, String username) {
        customerManager.unblockCustomer(username);
        System.out.println(RED + "Customer account unblocked successfully!" + RESET);
    }
}

class BankApp {
    public static final String RESET = "\u001B[0m";
    public static final String YELLOW = "\u001B[33m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String BLACK = "\u001B[30m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();
        CustomerManager customerManager = new CustomerManager();
        System.out.println(
                "==================================================================================================");
        System.out.println(PURPLE
                + "\n\t************************* Welcome to the Banking Application!**********************" + RESET);

        while (true) {
            System.out.println(YELLOW + "\nPlease select an option:" + RESET);
            System.out.println("1. Admin Login");
            System.out.println("2. Customer Login");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter admin username: ");
                    String adminUsername = scanner.nextLine();

                    // System.out.print("Enter admin password: ");
                    Console c = System.console();
                    char[] ch = c.readPassword("Enter a password");
                    for (int i = 0; i < ch.length; i++) {
                        System.out.print("*");
                    }
                    String adminPassword = new String(ch);

                    if (admin.login(adminUsername, adminPassword)) {
                        System.out.println(GREEN + " Admin login succesfull" + RESET);
                        adminMenu(admin, customerManager, scanner);
                    } else {
                        System.out.println(RED + "Admin login failed. Please try again." + RESET);
                    }
                    break;

                case 2:
                    System.out.print("Enter customer username: ");
                    String customerUsername = scanner.nextLine();
                    System.out.print("Enter customer password: ");
                    Console console = System.console();
                    char[] chars = console.readPassword();
                    String j = new String(chars);
                    String customerPassword = j;

                    Customer customer = customerManager.getCustomerByUsername(customerUsername);
                    if (customer != null && customer.getPassword().equals(customerPassword)) {
                        customerMenu(customerManager, customer, scanner);
                    } else {
                        System.out.println(RED + "Customer login failed. Please try again." + RESET);
                    }
                    break;

                case 3:
                    System.out.println(BLUE
                            + "\n\t\t*************************  Thank you for using the Banking Application!   ***************************"
                            + RESET);
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println(RED + "\nInvalid choice. Please select a valid option." + RESET);
            }
        }
    }

    private static void adminMenu(Admin admin, CustomerManager customerManager, Scanner scanner) {
        while (true) {
            System.out.println(YELLOW + "\nAdmin Menu:" + RESET);
            System.out.println("1. Create New Customer Account");
            System.out.println("2. View Customer Account Information");
            System.out.println("3. Block Customer Account");
            System.out.println("4. Unblock Customer Account");
            System.out.println("5. View All Customer Accounts");
            System.out.println("6. Exit Admin Menu");

            int adminChoice = scanner.nextInt();
            scanner.nextLine();

            switch (adminChoice) {
                case 1:
                    System.out.print("Enter new customer's username: ");
                    String newUsername = scanner.nextLine();
                    System.out.print("Enter new customer's password: ");
                    Console console1 = System.console();
                    char[] chars = console1.readPassword();
                    String s = new String(chars);
                    String newPassword = s;
                    System.out.print("Enter new customer's name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new customer's contact: ");
                    String newContact = scanner.nextLine();
                    double initialBalance = 0;
                    try {
                        System.out.print("Enter initial balance for the new customer: ");

                        initialBalance = scanner.nextDouble();
                        if (initialBalance < 0) {
                            System.out.println(RED + "Amount cannot be negative" + RESET);
                        } else {
                            scanner.nextLine(); // Consume the newline character
                            admin.createNewAccount(customerManager, newUsername, newPassword, newName, newContact,
                                    initialBalance);
                            Random random = new Random();
                            int accountNumber = random.nextInt(100000);
                            System.out.println(BLUE + " Your Account Number is " + RESET + accountNumber);

                            break;
                        }
                    } catch (Exception e) {
                        System.out.println(" Balace cannot be negative ");
                    }

                case 2:
                    System.out.print("Enter the username of the account to view: ");
                    String usernameToView = scanner.nextLine();
                    Customer accountToView = admin.viewCustomerAccount(customerManager, usernameToView);
                    if (accountToView != null) {
                        System.out.println(YELLOW + "\nAccount Information:" + RESET);
                        System.out.println("Username: " + accountToView.getUsername());
                        System.out.println("Name: " + accountToView.getName());
                        System.out.println("Contact: " + accountToView.getContact());
                        System.out.println("Balance: Rs." + accountToView.getBalance());
                        if (accountToView.isBlocked()) {
                            System.out.println(RED + "\nAccount is blocked." + RESET);
                        } else {
                            System.out.println(GREEN + "\nAccount is not blocked." + RESET);
                        }
                        accountToView.printTransactionHistory();
                    } else {
                        System.out.println(RED + "\nAccount not found." + RESET);
                    }
                    break;

                case 3:
                    System.out.print("Enter the Account Number  of the account to block: ");
                    String usernameToBlock = scanner.nextLine();
                    admin.blockCustomerAccount(customerManager, usernameToBlock);
                    break;

                case 4:
                    System.out.print("Enter the username of the account to unblock: ");
                    String usernameToUnblock = scanner.nextLine();
                    admin.unblockCustomerAccount(customerManager, usernameToUnblock);
                    break;

                case 5:
                    admin.viewAllCustomerAccounts(customerManager);

                    break;

                case 6:
                    return;

                default:
                    System.out.println(RED + "\nInvalid choice. Please select a valid option." + RESET);
            }
        }
    }

    private static void customerMenu(CustomerManager customerManager, Customer customer, Scanner scanner) {
        while (true) {
            System.out.println(YELLOW + "\n\t\tCustomer Menu:" + RESET);
            System.out.println("1. Update Contact Information");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. View Balance");
            System.out.println("5. View Transaction History");
            System.out.println("6. Transfer Money");
            System.out.println("7. Apply for Loan");
            System.out.println("8. Repay Loan");
            System.out.println("9. Exit Customer Menu");

            int customerChoice = scanner.nextInt();
            scanner.nextLine();

            switch (customerChoice) {
                case 1:
                    System.out.print("Enter new contact information: ");
                    String newContact = scanner.nextLine();
                    customer.updateContact(newContact);
                    System.out.println(GREEN + "Contact information updated successfully!" + RESET);
                    break;

                case 2:
                    try {
                        System.out.print("Enter the amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        scanner.nextLine();
                        if (depositAmount < 0) {
                            System.out.println(RED + "Amount cannot be negative " + RESET);
                            break;
                        } else {
                            customer.deposit(depositAmount);
                            System.out.println(GREEN + "Deposit successful!" + RESET);
                            break;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case 3:
                    try {
                        System.out.print("Enter the amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        scanner.nextLine();
                        if (withdrawAmount > 0) {
                            if (customer.withdraw(withdrawAmount)) {
                                System.out.println(GREEN + "Withdrawal successful!" + RESET);
                            } else {
                                System.out.println(
                                        RED + "Withdrawal failed. Insufficient balance or account is blocked." + RESET);
                            }
                            break;
                        } else {
                            System.out.println(RED + "Amount cannot be negative " + RESET);
                            break;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                case 4:
                    System.out.println(BLUE + "\nYour balance: Rs. " + RESET + customer.getBalance());
                    if (customer.isBlocked()) {
                        System.out.println(RED + "Your account is blocked." + RESET);
                    } else {
                        System.out.println(GREEN + "Your account is not blocked." + RESET);
                    }
                    break;

                case 5:
                    customer.printTransactionHistory();
                    break;

                case 6:
                    System.out.print("Enter recipient username: ");
                    String recipientUsername = scanner.nextLine();
                    System.out.print("Enter the amount to transfer: ");
                    double transferAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character
                    boolean success = customerManager.transferMoney(customer.getUsername(), recipientUsername,
                            transferAmount);
                    if (success) {
                        System.out.println(GREEN + "Transfer successful!" + RESET);
                    } else {
                        System.out.println(
                                RED + "Transfer failed. Check recipient username or insufficient balance." + RESET);
                    }
                    break;

                case 7:
                    try {

                        System.out.println(PURPLE + "Apply for loan Enter the details: " + RESET);
                        System.out.print("Enter the moblie number: ");
                        String mb = scanner.next();
                        System.out.print("Enter the Adhar Number: ");
                        String ad = scanner.next();
                        System.out.print("Enter the  age: ");
                        int age = scanner.nextInt();
                        System.out.print("Enter the your salary:");
                        int salary = scanner.nextInt();
                        System.out.print("Enter the Amount for loan: ");
                        double loanAmount = scanner.nextDouble();
                        System.out.print("Enter the Duration(number of years) of loan:");
                        int Duration = scanner.nextInt();
                        double Interest = (loanAmount * 12) / 100;
                        double m = Duration * 12;
                        double emi = (loanAmount + Interest) / m;
                        System.out.println(BLUE + "your loan monthly EMI: " + emi + RESET);
                        if ((age >= 21 && age <= 57) && (loanAmount >= 5000 && loanAmount <= 500000) && emi < salary) {
                            System.out.println(GREEN + "LOAN IS SUCCESSFULLY PASSED... " + RESET);
                        } else {
                            System.out.println(RED + "\tLOAN IS FAILED... " + RESET);
                        }
                        customerManager.applyForLoan(customer.getUsername(), loanAmount);
                        break;

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                case 8:
                    try {
                        System.out.print("Enter the loan repayment amount: ");
                        double repaymentAmount = scanner.nextDouble();
                        if (repaymentAmount > 0) {
                            scanner.nextLine(); // Consume the newline character
                            customerManager.repayLoan(customer.getUsername(), repaymentAmount);
                            System.out.println(GREEN + "Loan repayment successful!" + RESET);
                            break;
                        } else {
                            System.out.println(RED + "Amount cannot be negative " + RESET);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                case 9:
                    return;

                default:
                    System.out.println(RED + "Invalid choice. Please select a valid option." + RESET);
            }
        }
    }
}
