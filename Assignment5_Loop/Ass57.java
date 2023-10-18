
//7) WAP to print all the prime numbers between two entered numbers
import java.util.Scanner;

public class Ass57 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, n;
        System.out.println("Enter the start  number ");
        int start = sc.nextInt();
        System.out.println("Enter the  end number ");
        int end = sc.nextInt();

        // System.out.println("Factorial of numbers between two entered number ");
        System.out.println("Prime number are ");
        for (i = start, n = 0; i <= end; i++) {
            n = i;
            for (j = 2; j <= n / 2; j++) {
                if (n % j == 0) {
                    break;

                }

            }

            if (j > n / 2)
                System.out.println(n);

        }

    }
}
