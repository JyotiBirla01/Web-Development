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

public class Array15 {
    public void firstNonRepeating(int n, int a[]) {
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            int rep = 0;
            for (int j = 0; j < n; j++) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + " element of array ");
            a[i] = sc.nextInt();
        }
        System.out.println("Your output is ");
        Array15 obj = new Array15();
        obj.firstNonRepeating(n, a);

    }
}
