import java.util.InputMismatchException;
import java.util.Scanner;

public class Exa5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the value of a ");
            int a = sc.nextInt();
            System.out.println("Enter the value of b");
            int b = sc.nextInt();
            int c = a / b;

        } catch (ArithmeticException | InputMismatchException e) {
            if (e.getClass().getName().contains(" ArithmeticException"))
                System.out.println("Denominator cannot be zero ");
            else
                System.out.println("Enter only integer value ");

        }
        // System.out.println(c);
    }
}
