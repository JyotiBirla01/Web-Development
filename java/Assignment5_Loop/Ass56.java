import java.util.Scanner;

public class Ass56 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        System.out.println("Enter the start  number ");
        int start = sc.nextInt();
        System.out.println("Enter the  end number ");
        int end = sc.nextInt();

        for (i = start; i <= end; i++) {
            int fact = 1;
            for (j = 1; j <= i; j++) {
                fact = fact * j;
            }

            System.out.println("Factorial of " + i + " is " + fact);
        }

    }
}
