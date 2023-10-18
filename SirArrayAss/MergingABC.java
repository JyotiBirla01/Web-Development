
//Suppose A, B, C are arrays of integers of size M, N, and M + N respectively.
// The numbers in array A appear in ascending order while the numbers in array B appear 
//in descending order. Write a java progtam to produce third array C by merging arrays A
// and B in ascending order. . 
import java.util.Scanner;

public class MergingABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array1");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the size of array2");
        int m = sc.nextInt();
        int b[] = new int[m];
        int c[] = new int[m + n];

        System.out.println("Enter the elements in array1 in ascending order");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the elements in array2 in decending order");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = 0, j = 0; i < m + n; i++) {
            if (i < n) {
                c[i] = a[i];

            } else {
                c[i] = b[j];
                j++;
            }
            System.out.println(c[i]);

        }
        int temp;
        System.out.println("After merging array a and b in ascending order");
        for (int i = 0; i < m + n; i++) {
            for (int j = i + 1; j < m + n; j++) {
                if (c[i] > c[j]) {
                    temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
            System.out.println(c[i]);
        }
    }
}
