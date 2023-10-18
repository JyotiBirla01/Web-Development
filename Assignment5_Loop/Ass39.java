
import java.util.Scanner;

public class Ass39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int temp = n;
        int rem, sum = 0;
        while (n != 0) {
            // You must initialize factorial inside the loop because its value is changes
            // outside.
            int fact = 1;
            rem = n % 10;

            for (int i = 1; i <= rem; i++) {
                fact = fact * i;

            }

            sum = sum + fact;
            n = n / 10;

        }
        System.out.println(sum);
        if (sum == temp)
            System.out.println("Strong number ");
        else
            System.out.println("Not strong number");
    }
}
