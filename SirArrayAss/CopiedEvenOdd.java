
// 32. Given two arrays of integers A and B of sizes M and N respectively. Write a Write
//  a c program, which will produce a third array named C. such that the following sequence
//   is followed. 
// All even numbers of A from left to right are copied into C from left to right. 
// All odd numbers of A from left to right are copied into C from right to left. 
// All even numbers of B from left to right are copied into C from left to right. 
// All old numbers of B from left to right are copied into C from right to left.
// e.g., A is {3, 2, 1, 7, 6, 3} and B is {9, 3, 5, 6, 2, 8, 10} the resultant array C is 
// {2, 6, 6, 2, 8, 10, 5, 3, 9, 3, 7, 1, 3} 

import java.util.Scanner;

public class CopiedEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array1");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the size of array2");
        int m = sc.nextInt();
        int b[] = new int[m];
        int c[] = new int[m + n];

        System.out.println("Enter the elements in array1 ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the elements in array2 ");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int evenOfA = 0, oddOfA = 0, evenOfB = 0, oddOfB = 0;
    
        for (int i = 0, j = 0; i < m + n; i++) {
            if (a[i] % 2 == 0 && ) {
        c[i] = a[i];

            } else {
                c[i] = a[i];

            }
            if (b[i] % 2 == 0) {
    c[i] = b[i];

            } else {
            c[i] = b[i];

            }

        }
        System.out.println(evenOfA);
        System.out.println(evenOfB);
        System.out.println(oddOfA);
        System.out.println(oddOfB);
    }
}