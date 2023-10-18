
/*  Suppose X. Y, Z are arrays of integers of size M, N, and M + N respectively.
 The numbers in array X and Y appear in descending order. Write a java program to produce
  third array Z by merging arrays X and Y in descending order. 
  */
import java.util.Scanner;

public class Array31 {

    public int[] merge(int n, int m, int x[], int y[], int z[]) {
        for (int i = 0, j = 0; i < z.length; i++) {
            if (i < n)
                z[i] = x[i];
            else
                z[i] = y[j++];
        }
        return z;
    }

    public int[] arrange(int z[]) {
        for (int i = 0; i < z.length; i++) {
            for (int j = 0; j < z.length; j++) {
                if (z[i] > z[j]) {
                    int temp = z[i];
                    z[i] = z[j];
                    z[j] = temp;
                }
            }
        }
        return z;

    }

}

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int x[] = new int[n];
        System.out.println("Enter the elements in array1");
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }
        System.out.println("Enter the size of array2");
        int m = sc.nextInt();
        int y[] = new int[m];
        System.out.println("Enter the elements in array2");
        for (int i = 0; i < y.length; i++) {
            y[i] = sc.nextInt();
        }
        int z[] = new int[n + m];
        Array31 obj1 = new Array31();
        int result[] = obj1.merge(n, m, x, y, z);
        Array31 obj2 = new Array31();
        int ans[] = obj2.arrange(z);
        for (int i = 0; i < z.length; i++) {
            System.out.println(z[i]);
        }

    }
}
