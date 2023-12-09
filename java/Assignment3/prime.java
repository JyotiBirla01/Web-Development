import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int c = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                c++;
            }

        }
        if (c == 1)
            System.out.println("prime");
        else
            System.out.println("not Prime");

    }

}
