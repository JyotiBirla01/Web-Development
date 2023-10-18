
import java.util.Scanner;

public class PrimeNumber {
    public void check(int n) {
        int i;
        for (i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                break;
            }

        }
        if (n > 0 && i > n / 2) {
            System.out.println("Prime number ");

        } else
            System.out.println("Not prime ");

    }

}

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        PrimeNumber obj = new PrimeNumber();
        obj.check(n);

    }

}
