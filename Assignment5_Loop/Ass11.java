import java.util.Scanner;

public class Ass11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        for (int i = 1; i <= n * 2; i++) {
            if (i % 2 != 0)
                System.out.println(i + " is odd number ");
        }
    }

}
