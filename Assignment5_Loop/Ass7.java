
import java.util.Scanner;

public class Ass7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int i = 0;
        for (i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                break;
            } 

        }
        if (i > n / 2)
            System.out.println("Prime number ");
        else
            System.out.println("Not prime number ");
    }

}
