
//7) WAP to check whether entered number is prime or not.
import java.util.Scanner;

public class Ass7 {
    public String primeOrNot(int n) {
        boolean flag = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = false;
                break;

            }
        }
        if (n > 1 && flag)
            return "prime";
        // System.out.println("prime");
        else
            return "Not prime";
        // System.out.println("NOt prime");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();

        Ass7 obj = new Ass7();
        String p = obj.primeOrNot(n);
        System.out.println(p);

    }

}
