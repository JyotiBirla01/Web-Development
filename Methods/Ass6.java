
//6) WAP to find out the factors of a number.
import java.util.Scanner;

public class Ass6 {
    public void factors(int n) {
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        Ass6 obj = new Ass6();
        obj.factors(n);

    }

}
