import java.util.Scanner;

public class Ass52 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start number ");
        int start = sc.nextInt();
        System.out.println("Enter the Last  number ");
        int end = sc.nextInt();
        int rem, n;
        int cube, sum;
        int i, p;
        for (i = start, n = 0; i <= end; i++) {
            n = i;
            p = n;
            sum = 0;

            while (n != 0) {
                rem = n % 10;
                cube = sum + rem * rem * rem;
                // sum = sum + cube;

                n = n / 10;

            }

            if (sum == p) {
                System.out.println(p + "  is Armstrong number ");
            }
        }

    }
}
