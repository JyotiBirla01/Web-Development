
//8) WAP to print Fibonacci series.
import java.util.Scanner;

public class Ass8 {
    public void fibonacci(int n) {
        int a = -1, b = 1, c;
        for (int i = 1; i <= n; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        Ass8 obj = new Ass8();
        obj.fibonacci(n);

    }

}
