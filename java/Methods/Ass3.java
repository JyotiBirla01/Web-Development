
//3) WAP to find out the sum of N natural number.
import java.util.Scanner;

public class Ass3 {
    public static void sumOfNatural(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;

        }
        System.out.println("Sum of natural number is " + sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        sumOfNatural(n);
    }

}
