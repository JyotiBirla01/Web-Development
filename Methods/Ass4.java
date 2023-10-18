//) WAP to print table of a number.

import java.util.Scanner;

public class Ass4 {
    public void table(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i *j );

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        Ass4 obj = new Ass4();
        obj.table(n);

    }

}
