import java.io.*;
import java.util.*;

class Customer {
    private String username;
    private String password;
    private String name;
    private String contact;
    private double balance;
    private boolean isBlocked;

    public Customer(String username, String password, String name, String contact, double balance) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.contact = contact;
        this.balance = balance;
        this.isBlocked = false;
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
        this.contact = newContact;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (!isBlocked && amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void block() {
        isBlocked = true;
    }

    public String toFileString() {
        return username + "," + password + "," + name + "," + contact + "," + balance + "," + isBlocked;
    }

    public void printTransactionHistory() {
    }
}

class CustomerManager {
    private List<Customers> customers;
    private static final String CUSTOMER_FILE = "customers.txt";

    public CustomerManager() {
        customers = new ArrayList<>();
        loadCustomersFromFile();
    }

    private void loadCustomersFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(CUSTOMER_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 6) {
                    Customers customer = new Customers(data[0], data[1], data[2], data[3], Double.parseDouble(data[4]));
                    customer.block();
                    customers.add(customer);
                } else if (data.length == 5) {
                    Customers customer = new Customers(data[0], data[1], data[2], data[3], Double.parseDouble(data[4]));
                    customers.add(customer);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createCustomer(String username, String password, String name, String contact, double balance) {
        Customers newCustomer = new Customers(username, password, name, contact, balance);
        customers.add(newCustomer);
        saveCustomersToFile();
    }

    public List<Customers> getAllCustomers() {
        return customers;
    }

    private void saveCustomersToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CUSTOMER_FILE))) {
            for (Customers customer : customers) {
                writer.write(customer.toFileString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Customers getCustomerByUsername(String usernameToFind) {
        for (Customers customer : customers) {
            if (customer.getUsername().equals(usernameToFind)) {
                return customer;
            }
        }
        return null;
    }

    public void blockCustomer(String username) {
        Customers customer = getCustomerByUsername(username);
        if (customer != null) {
            customer.block();
            saveCustomersToFile();
        }
    }
}

class Admin {
    private static final String ADMIN_USERNAME = "ciphers";
    private static final String ADMIN_PASSWORD = "ciphers04";

    public boolean login(String username, String password) {
        return ADMIN_USERNAME.equals(username) && ADMIN_PASSWORD.equals(password);
    }

    public void viewAllCustomerAccounts(CustomerManager customerManager) {
        List<Customers> customers = customerManager.getAllCustomers();
        System.out.println("All Customer Accounts:");
        for (Customers customer : customers) {
            System.out.println("Username: " + customer.getUsername() + ", Name: " + customer.getName());
        }
    }

    public Customers viewCustomerAccount(CustomerManager customerManager, String username) {
        return customerManager.getCustomerByUsername(username);
    }

    public void blockCustomerAccount(CustomerManager customerManager, String username) {
        customerManager.blockCustomer(username);
        System.out.println("Customer account blocked successfully!");
    }

    public void createNewAccount(CustomerManager customerManager, String username, String password, String name,
            String contact, double balance) {
        customerManager.createCustomer(username, password, name, contact, balance);
        System.out.println("New customer account created successfully!");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner  sc= new Scanner(System.in);
        Admin admin = new Admin();
        CustomerManager customerManager = new CustomerManager();

        System.out.println("Welcome to the Banking Application!");

        while (true) {
            System.out.println("\nPlease select an option:");
            System.out.println("1. Admin Login");
            System.out.println("2. Customer Login");
            System.out.println("3. Exit");

            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter admin username: ");
                    String adminUsername = sc.nextLine();
                    System.out.print("Enter admin password: ");
                    String adminPassword = sc.nextLine();

                    if (admin.login(adminUsername, adminPassword)) {
                        adminMenu(admin, customerManager, sc);
                    } else {
                        System.out.println("Admin login failed. Please try again.");
                    }
                    break;

                case 2:
                    System.out.print("Enter customer username: ");
                    String customerUsername = sc.nextLine();
                    System.out.print("Enter customer password: ");
                    String customerPassword = sc.nextLine();

                    Customers customer = customerManager.getCustomerByUsername(customerUsername);
                    if (customer != null && customer.getPassword().equals(customerPassword)) {
                        customerMenu(customerManager, customer, sc);
                    } else {
                        System.out.println("Customer login failed. Please try again.");
                    }
                    break;

                case 3:
                    System.out.println("Thank you for using the Banking Application!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private static void adminMenu(Admin admin, CustomerManager customerManager, Scanner sc) {
        while (true) {
            System.out.println("\nAdmin Menu:");
            System.out.println("1. View All Customer Accounts");
            System.out.println("2. View Customer Account Information");
            System.out.println("3. Block Customer Account");
            System.out.println("4. Create New Customer Account");
            System.out.println("5. Exit Admin Menu");

            int adminChoice = sc.nextInt();
            sc.nextLine();
            switch (adminChoice) {
                case 1:
                    admin.viewAllCustomerAccounts(customerManager);
                    break;

                case 2:
                    System.out.print("Enter the username of the account to view: ");
                    String usernameToView = sc.nextLine();
                    Customers accountToView = admin.viewCustomerAccount(customerManager, usernameToView);
                    if (accountToView != null) {
                        System.out.println("\nAccount Information:");
                        System.out.println("Username: " + accountToView.getUsername());
                        System.out.println("Name: " + accountToView.getName());
                        System.out.println("Contact: " + accountToView.getContact());
                        System.out.println("Balance: $" + accountToView.getBalance());
                        if (accountToView.isBlocked()) {
                            System.out.println("Account is blocked.");
                        } else {
                            System.out.println("Account is not blocked.");
                        }
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter the username of the account to block: ");
                    String usernameToBlock = sc.nextLine();
                    admin.blockCustomerAccount(customerManager, usernameToBlock);
                    break;

                case 4:
                    System.out.print("Enter new customer's username: ");
                    String newUsername = sc.nextLine();
                    System.out.print("Enter new customer's password: ");
                    String newPassword = sc.nextLine();
                    System.out.print("Enter new customer's name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter new customer's contact: ");
                    String newContact = sc.nextLine();
                    System.out.print("Enter initial balance for the new customer: ");
                    double initialBalance = sc.nextDouble();
                    sc.nextLine(); // Consume the newline character
                    admin.createNewAccount(customerManager, newUsername, newPassword, newName, newContact,
                            initialBalance);
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private static void customerMenu(CustomerManager customerManager, Customers customer, Scanner sc) {
        while (true) {
            System.out.println("\nCustomer Menu:");
            System.out.println("1. Update Contact Information");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. View Balance");
            System.out.println("5. Exit Customer Menu");

            int customerChoice = sc.nextInt();
            sc.nextLine();  // Consume the newline character

            switch (customerChoice) {
                case 1:
                    System.out.print("Enter new contact information: ");
                    String newContact = sc.nextLine();
                    customer.updateContact(newContact);
                    System.out.println("Contact information updated successfully!");
                    break;

                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    sc.nextLine();  // Consume the newline character
                    customer.deposit(depositAmount);
                    System.out.println("Deposit successful!");
                    break;

                case 3:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    sc.nextLine();  // Consume the newline character
                    if (customer.withdraw(withdrawAmount)) {
                        System.out.println("Withdrawal successful!");
                    } else {
                        System.out.println("Withdrawal failed. Insufficient balance or account is blocked.");
                    }
                    break;

                case 4:
                    System.out.println("Your balance: $" + customer.getBalance());
                    if (customer.isBlocked()) {
                        System.out.println("Your account is blocked.");
                    } else {
                        System.out.println("Your account is not blocked.");
                    }
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
}
}
}