
// WAP to convert binary number into decimal number
import java.util.Scanner;

class Ass43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number");
        int n = sc.nextInt();
        double rem, p, sum = 0;

        for (int i = 0; n != 0; i++) {
            rem = n % 10;

            p = rem * (Math.pow(2, i));
            sum = sum + p;
            n = n / 10;

        }

        System.out.println(sum);
    }
}