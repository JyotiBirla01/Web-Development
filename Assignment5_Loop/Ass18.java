import java.util.Scanner;

public class Ass18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 1, b = 2, c;
        for (int i = 1; i <= (n - 2); i++) {
            c = a * b;
            System.out.println(c);
            a = b;
            b = c;

        }
    }

}
