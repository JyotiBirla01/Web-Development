
//WAP to count number of digits
import java.util.Scanner;

public class Ass35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int count = 0, rem;
        while (n != 0) {
            rem = n % 10;
            // System.out.println(rem);
            count++;
            n = n / 10;

        }
        System.out.println("The number of digits is " + count);

    }

}
