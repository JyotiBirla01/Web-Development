
//WAP to check whether entered number is perfect or not
import java.util.Scanner;

public class Ass34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                // if (n == i)
                // break;

                sum = sum + i;

            }
        }

        if (sum == n)
            System.out.println("The number is perfect");

        else
            System.out.println("The number is not perfect ");
    }

}
