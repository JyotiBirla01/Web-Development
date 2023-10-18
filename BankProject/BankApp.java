
import java.io.*;
import java.net.PasswordAuthentication;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

 class SendEmail {

    private String emailAddressTo = new String();
    private String msgSubject = new String();
    private String msgText = new String();

    final String USER_NAME = "praveenmukati52@gmail.com"; // User name of the Goole(gmail) account
    final String PASSSWORD = "dnybrenqrowmjhis"; // Password of the Goole(gmail) account
    final String FROM_ADDRESS = "vinaypaliwal834@gmail.com"; // From addresss

    public void javaEmailSender() {
    }

    public static void main(String[] args) {
        SendEmail email = new SendEmail();
        // Sending test email
        email.createAndSendEmail("praveenmukati52@gmail.com", "Test email subject",
                "Congratulations !!! \nThis is paliwal email sent by java class.");
    }

    public void createAndSendEmail(String emailAddressTo, String msgSubject, String msgText) {
        this.emailAddressTo = emailAddressTo;
        this.msgSubject = msgSubject;
        this.msgText = msgText;
        sendEmailMessage();
    }

    private void sendEmailMessage() {

        // Create email sending properties
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
 
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("vinaypaliwal834@gmail.com", "dnybrenqrowmjhis");
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("vinaypaliwal834@gmail.com")); // Set from address of the email
            message.setContent(msgText, "text/html"); // set content type of the email

            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("praveenmukati52@gmail.com")); // Set
                                                                                                                 // email
                                                                                                                 // recipient

            message.setSubject("Hello World"); // Set email message subject
            Transport.send(message); // Send email message

            System.out.println("sent email successfully!");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    public void setEmailAddressTo(String emailAddressTo) {
        this.emailAddressTo = emailAddressTo;
    }

    public void setSubject(String subject) {
        this.msgSubject = subject;
    }

    public void setMessageText(String msgText) {
        this.msgText = msgText;
    }

}

class Transaction {
    private String description;
    private double amount;
    private Date timestamp;

    public Transaction(String description, double amount) {
        this.description = description;
        this.amount = amount;
        this.timestamp = new Date();
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public String getTimestamp() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(timestamp);
    }
}

class BakApp {
    private String username;
    private String password;
    private String name;
    private String contact;
    private double balance;
    private boolean isBlocked;
    private List<Transaction> transactionHistory;
    private double loanBalance;

    public BakApp(String username, String password, String name, String contact, double balance) {
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
            recordTransaction("Withdrawal", -amount);
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
            recordTransaction("Transfer to " + recipient.getUsername(), -amount);
            recipient.recordTransaction("Received from " + getUsername(), amount);
        }
    }

    public void applyForLoan(double amount) {
        if (!isBlocked && amount > 0 && loanBalance == 0) {
            loanBalance += amount;
            balance += amount;
            recordTransaction("Loan Received", amount);
        }
    }

    public void repayLoan(double amount) {
        if (!isBlocked && amount > 0 && loanBalance > 0) {
            loanBalance -= amount;
            balance -= amount;
            recordTransaction("Loan Repayment", -amount);
        }
    }

    public void printTransactionHistory() {
        System.out.println("Transaction History:");
        for (Transaction transaction : transactionHistory) {
            System.out.println("Description: " + transaction.getDescription());
            System.out.println("Amount: $" + transaction.getAmount());
            System.out.println("Timestamp: " + transaction.getTimestamp());
            System.out.println();
        }
    }

    private void recordTransaction(String description, double amount) {
        Transaction transaction = new Transaction(description, amount);
        transactionHistory.add(transaction);
    }

    public String toFileString() {
        return username + "," + password + "," + name + "," + contact + "," + balance + "," + isBlocked + ","
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
            System.out.println("Cannot create a new customer. Maximum limit reached.");
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

    public void applyForLoan(String username, double amount) {
        Customer customer = getCustomerByUsername(username);
        if (customer != null) {
            customer.applyForLoan(amount);
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
    private static final String ADMIN_USERNAME = "Vinay";
    private static final String ADMIN_PASSWORD = "Vinay123";

    public boolean login(String username, String password) {
        return ADMIN_USERNAME.equals(username) && ADMIN_PASSWORD.equals(password);
    }

    public void viewAllCustomerAccounts(CustomerManager customerManager) {
        Customer[] customers = customerManager.getAllCustomers();
        System.out.println("All Customer Accounts:");
        for (Customer customer : customers) {
            System.out.println("Username: " + customer.getUsername() + ", Name: " + customer.getName());
        }
    }

    public Customer viewCustomerAccount(CustomerManager customerManager, String username) {
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

    public void unblockCustomerAccount(CustomerManager customerManager, String username) {
        customerManager.unblockCustomer(username);
        System.out.println("Customer account unblocked successfully!");
    }
}

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();
        CustomerManager customerManager = new CustomerManager();

        System.out.println("Welcome to the Banking Application!");

        while (true) {
            System.out.println("\nPlease select an option:");
            System.out.println("1. Admin Login");
            System.out.println("2. Customer Login");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter admin username: ");
                    String adminUsername = scanner.nextLine();
                    System.out.print("Enter admin password: ");
                    String adminPassword = scanner.nextLine();

                    if (admin.login(adminUsername, adminPassword)) {
                        adminMenu(admin, customerManager, scanner);
                    } else {
                        System.out.println("Admin login failed. Please try again.");
                    }
                    break;

                case 2:
                    System.out.print("Enter customer username: ");
                    String customerUsername = scanner.nextLine();
                    System.out.print("Enter customer password: ");
                    String customerPassword = scanner.nextLine();

                    Customer customer = customerManager.getCustomerByUsername(customerUsername);
                    if (customer != null && customer.getPassword().equals(customerPassword)) {
                        customerMenu(customerManager, customer, scanner);
                    } else {
                        System.out.println("Customer login failed. Please try again.");
                    }
                    break;

                case 3:
                    System.out.println("Thank you for using the Banking Application!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private static void adminMenu(Admin admin, CustomerManager customerManager, Scanner scanner) {
        while (true) {
            System.out.println("\nAdmin Menu:");
            System.out.println("1. View All Customer Accounts");
            System.out.println("2. View Customer Account Information");
            System.out.println("3. Block Customer Account");
            System.out.println("4. Unblock Customer Account");
            System.out.println("5. Create New Customer Account");
            System.out.println("6. Exit Admin Menu");

            int adminChoice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (adminChoice) {
                case 1:
                    admin.viewAllCustomerAccounts(customerManager);
                    break;

                case 2:
                    System.out.print("Enter the username of the account to view: ");
                    String usernameToView = scanner.nextLine();
                    Customer accountToView = admin.viewCustomerAccount(customerManager, usernameToView);
                    if (accountToView != null) {
                        System.out.println("Account Information:");
                        System.out.println("Username: " + accountToView.getUsername());
                        System.out.println("Name: " + accountToView.getName());
                        System.out.println("Contact: " + accountToView.getContact());
                        System.out.println("Balance: Rs." + accountToView.getBalance());
                        if (accountToView.isBlocked()) {
                            System.out.println("Account is blocked.");
                        } else {
                            System.out.println("Account is not blocked.");
                        }
                        accountToView.printTransactionHistory();
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter the username of the account to block: ");
                    String usernameToBlock = scanner.nextLine();
                    admin.blockCustomerAccount(customerManager, usernameToBlock);
                    break;

                case 4:
                    System.out.print("Enter the username of the account to unblock: ");
                    String usernameToUnblock = scanner.nextLine();
                    admin.unblockCustomerAccount(customerManager, usernameToUnblock);
                    break;

                case 5:
                    System.out.print("Enter new customer's username: ");
                    String newUsername = scanner.nextLine();
                    System.out.print("Enter new customer's password: ");
                    String newPassword = scanner.nextLine();
                    System.out.print("Enter new customer's name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new customer's contact: ");
                    String newContact = scanner.nextLine();
                    System.out.print("Enter initial balance for the new customer: ");
                    double initialBalance = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character
                    admin.createNewAccount(customerManager, newUsername, newPassword, newName, newContact,
                            initialBalance);
                    break;

                case 6:
                    return;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private static void customerMenu(CustomerManager customerManager, Customer customer, Scanner scanner) {
        while (true) {
            System.out.println("\nCustomer Menu:");
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
            scanner.nextLine(); // Consume the newline character

            switch (customerChoice) {
                case 1:
                    System.out.print("Enter new contact information: ");
                    String newContact = scanner.nextLine();
                    customer.updateContact(newContact);
                    System.out.println("Contact information updated successfully!");
                    break;

                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character
                    customer.deposit(depositAmount);
                    System.out.println("Deposit successful!");
                    break;

                case 3:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character
                    if (customer.withdraw(withdrawAmount)) {
                        System.out.println("Withdrawal successful!");
                    } else {
                        System.out.println("Withdrawal failed. Insufficient balance or account is blocked.");
                    }
                    break;

                case 4:
                    System.out.println("Your balance: Rs. " + customer.getBalance());
                    if (customer.isBlocked()) {
                        System.out.println("Your account is blocked.");
                    } else {
                        System.out.println("Your account is not blocked.");
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
                        System.out.println("Transfer successful!");
                    } else {
                        System.out.println("Transfer failed. Check recipient username or insufficient balance.");
                    }
                    break;

                case 7:
                    System.out.print("Enter the loan amount: ");
                    double loanAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character
                    customerManager.applyForLoan(customer.getUsername(), loanAmount);
                    System.out.println("Loan application submitted!");
                    break;

                case 8:
                    System.out.print("Enter the loan repayment amount: ");
                    double repaymentAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character
                    customerManager.repayLoan(customer.getUsername(), repaymentAmount);
                    System.out.println("Loan repayment successful!");
                    break;

                case 9:
                    return;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
