
// WAP to calculate the sum of given series x^1 + x^2 + x ^3.........x^n
import java.util.Scanner;

public class SinglePower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base ");
        int x = sc.nextInt();
        System.out.println("Enter the exponenet");
        int y = sc.nextInt();

        int result = 1, sum = 0;
        for (int i = 1; i <= y; i++) {
            result = result * x;
            sum = sum + result;

        }
        System.out.println(result);
        System.out.println(sum);
    }

}
