
//7) WAP to check whether entered number is prime or not.
import java.util.Scanner;

public class Ass77 {
    public static boolean primeOrNot(int n) {
        boolean flag = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = false;
                break;

            }
        }
        if (n > 1 && flag)
            return true;
        // System.out.println("prime");
        else
            return false;
        // System.out.println("NOt prime");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();

        Ass77 obj = new Ass77();
        if (obj.primeOrNot(n))
            System.out.println("prime");
        else
            System.out.println("Not Prime");

    }

}
