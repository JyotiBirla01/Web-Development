
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exa1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the 1st value");
            int a = sc.nextInt();
            System.out.println("Enter the 2nd Value ");
            int b = sc.nextInt();
            int c = a / b;
            System.out.println("Result " + c);

        } catch (ArithmeticException e) {
            System.out.println("Denominator cannot be zero");
        }
        catch(InputMismatchException e){
            System.out.println("please enter only integer value ");

        }
        System.out.println(" At the end ...");

    }

}
