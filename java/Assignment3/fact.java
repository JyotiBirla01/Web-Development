import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int fact = 1;
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
            sum = sum + (i / fact);

        }
        System.out.println(sum);

    }

}
