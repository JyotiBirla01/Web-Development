// A
// AB
// A C
// A D
// ABCDE

import java.util.Scanner;

public class RightTriangle22 {
    public void hollowTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 5 || i == j || j == 1)
                    System.out.print((char) (j + 64));

                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        RightTriangle22 obj = new RightTriangle22();
        obj.hollowTriangle(n);
    }

}
