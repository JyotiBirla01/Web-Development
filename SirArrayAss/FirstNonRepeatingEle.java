// Q.14. Find the first non-repeating elment in given array of integers
// Find the first non-repeating element in a given array arr of N integers.
// Note: Array consists of only positive and negative integers and not zero.
// Example 1:
// Input : arr[] = {-1, 2, -1, 3, 2}
// Output : 3
// Explanation:
// -1 and 2 are repeating whereas 3 is 
// the only number occuring once.
// Hence, the output is 3.

// Example 2:
// Input : arr[] = {1, 1, 1}
// Output : 0

import java.util.Scanner;

public class FirstNonRepeatingEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements in  array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();

        }
        int i, j;
        boolean flag = true;
        int b[] = new int[n];
        int rep;
        System.out.print("First Non repeating element is :- ");
        for (i = 0; i < a.length; i++) {
            rep = 0;
            for (j = 0; j < a.length; j++) {

                if (a[i] == a[j])
                    rep++;
            }
            if (rep < 2) {
                flag = false;
                System.out.println(a[i]);
                break;

            }

        }
        if (flag) {
            System.out.println("0");
        }

    }
}