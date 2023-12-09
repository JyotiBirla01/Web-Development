
//9) WAP to print N even number .
import java.util.Scanner;

public class Ass10 {
    public static void EvenUptoN(int n) {

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        // Ass9 obj = new Ass9();
        // obj.fibonacci(n);
        EvenUptoN(n);

    }

}
