
import java.util.Scanner;

public class Ass6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                System.out.println(i);

        }
    }

}
