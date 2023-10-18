// 1
// 222
// 33333
// 4444444
// 555555555

import java.util.Scanner;

public class iPattern29 {
    public static void oddTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (2 * i) - 1; j++) {

                System.out.print(i);

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        oddTriangle(n);

    }

}
