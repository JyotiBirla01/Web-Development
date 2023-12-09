import java.util.Scanner;

public class Ass53 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start number ");
        int start = sc.nextInt();
        System.out.println("Enter the Last  number ");
        int end = sc.nextInt();
        int rem, n;
        int sum;
        int i, p;
        for (i = start, n = 0; i <= end; i++) {
            n = i;
            p = n;
            sum = 0;

            while (n != 0) {
                int fact = 1;
                rem = n % 10;
                for (int j = 1; j <= rem; j++) {
                    fact = fact * j;
                }
                sum = sum + fact;

                n = n / 10;

            }

            if (sum == p)
                System.out.println(p + "  is  strong number ");

        }

    }
}
