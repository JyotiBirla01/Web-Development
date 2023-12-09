
// 31. Suppose X. Y, Z are arrays of integers of size M, N, and M + N respectively.
//  The numbers in array X and Y appear in descending order. Write a java program to produce
//   third array Z by merging arrays X and Y in descending order. 
import java.util.Scanner;

public class MergeXYZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array1");
        int n = sc.nextInt();
        int x[] = new int[n];
        System.out.println("Enter the size of array2  ");
        int m = sc.nextInt();
        int y[] = new int[m];
        int z[] = new int[m + n];

        System.out.println("Enter the elements in array1 in descending order");
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        System.out.println("Enter the elements in array2 in descending order");
        for (int i = 0; i < m; i++) {
            y[i] = sc.nextInt();
        }

        System.out.println("After merging array");
        for (int i = 0, j = 0; i < m + n; i++) {
            if (i < n) {
                z[i] = x[i];

            } else {
                z[i] = y[j];
                j++;
            }
            // System.out.println(z[i]);
        }
        int temp;
        System.out.println("merging arrays X and Y in descending order. ");
        for (int i = 0; i < m + n; i++) {
            for (int j = i + 1; j < n + m; j++) {
                if (z[i] < z[j]) {
                    temp = z[i];
                    z[i] = z[j];
                    z[j] = temp;

                }

            }
            System.out.println(z[i]);
        }
    }
}
