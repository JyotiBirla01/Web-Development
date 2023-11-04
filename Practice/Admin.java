
//import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Admin {
    private static final String ADMIN_USERNAME = "TRS";
    private static final String ADMIN_PASSWORD = "TRS05";

    // Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    public boolean login(String username, String password) {
        return ADMIN_USERNAME.equals(username) && ADMIN_PASSWORD.equals(password);
    }

    public void customerData() {

        boolean fname, lname, faname, aadhar, pancard, dob, add, nominee, email, gender1;
        fname = lname = faname = aadhar = pancard = dob = add = nominee = email = gender1=true ;

        boolean flag = true;
        while (flag) {
            while (fname) { 
                System.out.println("Enter First name ");
                String userName = scanner.nextLine();
                boolean a = userName.matches("[a-zA-Z , ]+");
                if (a == false) {
                    System.out.println("Invalide first name");
                    continue;
                }
                fname = false;
            }
            while (lname) {
                System.out.println("Enter Last name ");
                String lastName = scanner.nextLine();
                boolean b = lastName.matches("[a-zA-Z , ]+");
                if (b == false) {
                    System.out.println("Invalide last name");
                    continue;
                }
                lname = false;
            }
            while (faname) {
                System.out.println("Enter Father's name ");
                String fatherName = scanner.nextLine();
                boolean c = fatherName.matches("[a-zA-Z , ]+");
                if (c == false) {
                    System.out.println("Invalide  father's name");
                    continue;
                }
                faname = false;
            }
            while (aadhar) {
                System.out.println("Enter Aadhar Number ");
                String aadharNo = scanner.nextLine();
                boolean aNo = aadharNo.matches("\\d{12}");
                if (aNo == false) {
                    System.out.println("Invalide Aadhar number");

                    continue;
                }
                aadhar = false;
            }
            // change 8 digit some characcters all in capital 5 character 4 digit 1 char
            while (pancard) {
                System.out.println("Enter Pancard number ");
                String pancardNo = scanner.nextLine();
                boolean a = pancardNo.matches("[A-Z]{5}[0-9]{4}[A-Z]");
                if (a == false) {
                    System.out.println("Invalide Pancard Number");
                    continue;
                }
                pancard = false;
            }
            while (dob) {
                System.out.println("Enter date in this formate (yyyy-MM-dd) ");
                String dateOfBirth = scanner.nextLine();
                boolean a = dateOfBirth.matches("\\d{4}-\\d{2}-\\d{2}");
                if (a == false) {
                    System.out.println("Invalide date");
                    continue;
                }
                dob = false;
            }
            while (add) {
                System.out.println("Enter your address ");
                String address = scanner.nextLine();
                boolean c = address.matches("[a-zA-z0-9 \\-\\. , ]+");
                if (c == false) {
                    System.out.println("Invalide  address");
                    continue;
                }
                add = false;
            }
            while (nominee) {
                System.out.println("Enter Nominee name ");
                String nomineeName = scanner.nextLine();
                boolean a = nomineeName.matches("[a-zA-Z , ]+");
                if (a == false) {
                    System.out.println("Invalide Name");
                    continue;
                }
                nominee = false;
            }
            while (email) {
                System.out.println("Enter  email address ");
                String emailAddress = scanner.nextLine();
              //  boolean a = emailAddress.matches("^[a-z0-9]+[@][a-z]+[\\.][a-z] ");
                  //   boolean a = emailAddress.matches("^(.+)@(.+)$ ");
                     boolean a = emailAddress.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
                if (a == false) {
                    System.out.println("Invalide email  address");
                    continue;
                }
                email = false;
            }
            while (gender1) {
                System.out.println("Enter gender  ");
                String gender = scanner.nextLine();
                boolean a = gender.matches("[a-zA-Z , ]+");
                if (a == false) {
                    System.out.println("Invalide ");
                    continue;
                }
                gender1 = false;
            }
           
            flag = false;

        }

    }
    public void createAccount(){
        customerData();
    }

    public static void main(String[] args) {
        Admin a = new Admin();
        a.customerData();
    }
}