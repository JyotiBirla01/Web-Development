import java.util.InputMismatchException;
import java.util.Scanner;

public class Exa4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the name ");
            String s = sc.nextLine();
            char ch = s.charAt(6);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String is too small ");

        }
        try {
            System.out.println("Enter the number a ");
            int a = sc.nextInt();
            System.out.println("Enter the number b");
            int b = sc.nextInt();
            int c = a / b;
            System.out.println(c);
        }
        // catch (Exception e) {
        // System.out.println(e);
        // }
        catch (ArithmeticException e) {
            System.out.println("denominator cannot be zero ");
        } catch (InputMismatchException e) {
            System.out.println("Enter only integer value");
        }

    }
}
