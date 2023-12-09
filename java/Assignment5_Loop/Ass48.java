
// WAP to find out the factors of all the numbers between two entered numbers
import java.util.Scanner;

public class Ass48 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start  number ");
        int start = sc.nextInt();
        System.out.println("Enter the  end number ");
        int end = sc.nextInt();
        int fact = 1;
        for (int i = start; i <= end; i++) {
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0)

                    System.out.println("factors of " + i + "  is " + j);
            }
        }
        System.out.println();
    }

}
