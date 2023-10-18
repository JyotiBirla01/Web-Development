import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int a = -1;
        int b = 1;
        int c;

        for (int i = 1; i <= n; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }

    }

}
