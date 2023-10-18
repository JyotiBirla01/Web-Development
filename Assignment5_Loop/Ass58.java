import java.util.Scanner;

public class Ass58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number");
        int n = sc.nextInt();
        int rem, b = 0, b2 = 0;

        while (n != 0) {
            rem = n % 2;
            b = b * 10 + rem;
            n = n / 2;
        }

        while (b != 0) {

            int rem2 = b % 2;
            b2 = b2 * 10 + rem2;
            b = b / 10;
        }
        System.out.println(b2);
    }

}
