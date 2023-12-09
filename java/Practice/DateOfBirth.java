import java.time.LocalDate;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your date of birth (YYYY-MM-DD): ");
        String dateOfBirth = scanner.nextLine();

        System.out.print("Enter the current date (YYYY-MM-DD): ");
        String currentDate = scanner.nextLine();

        LocalDate birthDate = LocalDate.parse(dateOfBirth);
        LocalDate today = LocalDate.parse(currentDate);
        

        int age = today.getYear() - birthDate.getYear();

        System.out.println("Your age is " + age);
    }
}