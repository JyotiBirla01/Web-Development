
/*Suppose A, B, C are arrays of integers of size M, N, and M + N respectively. 
The numbers in array A appear in ascending order while the numbers in array B appear
 in descending order. Write a java progtam to produce third array C by merging arrays A
  and B in ascending order. . 
  */
import java.util.Scanner;

public class Array30 {

    public int[] merge(int n, int m, int a[], int b[], int c[]) {

        for (int i = 0, j = 0; i < c.length; i++) {
            if (i < n)
                c[i] = a[i];
            else
                c[i] = b[j++];
        }

        return c;
    }

    public int[] arrange(int c[]) {
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                if (c[i] < c[j]) {
                    int temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }

        }
        return c;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array1 ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements in array1 in ascending order ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the size of array2 ");
        int m = sc.nextInt();
        int b[] = new int[m];
        System.out.println("Enter the elements in array2 in decending order ");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int c[] = new int[n + m];
        Array30 obj = new Array30();

        Array30 obj1 = new Array30();
        System.out.println("After Merging array  ");
        int result[] = obj1.merge(n, m, a, b, c);
        for (int i = 0; i < c.length; i++) {
            System.out.println(result[i]);
        }
        Array30 obj2 = new Array30();
        int ans[] = obj2.arrange(c);
        System.out.println("Elements in ascending order");
        for (int j = 0; j < ans.length; j++) {
            System.out.println(ans[j]);
        }

    }
}