
import java.util.Scanner;

public class Ass17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int sum = 1;
        for (int i = 0; i <= (n - 1); i++) {
            sum = sum + i;
            System.out.print(" " + sum);
        }
    }

}
