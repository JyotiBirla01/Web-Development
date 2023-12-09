
// ABCDE
//  A__D
//   A_C
//    AB
import java.util.Scanner;

public class HollowReverse54 {
    public static void Alphabet(int n) {
        int i, j, k;
        for (i = n; i >= 1; i--) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                if (i == 4 && (k == 2 || k == 3))
                    System.out.print("_");
                else if (i == 3 && k == 2)
                    System.out.print("_");
                else
                    System.out.print((char) (k + 64));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        Alphabet(n);

    }

}
