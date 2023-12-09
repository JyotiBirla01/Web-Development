import java.util.Scanner;

public class Revision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int rem = 1, rev = 0;
        double sum = 0;
        int i, j = 0;
        for (i = n1; i <= n2; i++) {

            int n = i;

            while (n != 0) {
                rem = n % 10;
                rev = rev * 10 + rem;
                n = n / 10;

            }
            System.out.println(rev);

        }

        if (rev == i)
            System.out.println(j + "Perfect ");
        else
            System.out.println("not perfect");

    }

}
