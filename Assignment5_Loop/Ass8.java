import java.util.Scanner;

public class Ass8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int a = -1, b = 1, c, d = 0;
        for (int i = 1; i <= n; i++) {
            c = a + b;

            System.out.print(c + " ");
            a = b;
            b = c;
        }

    }

}
