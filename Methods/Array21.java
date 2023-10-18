/*Longest consecutive sequence.
Given an array of positive integers. Find the length of the longest sub-
// such that elements in the subsequence are consecutive integers, the consecutive
// numbers can be in any order.
 
Example 1:
Input:
N = 7
a[] = {2,6,1,9,4,5,3}
Output:
6
Explanation:
The consecutive numbers here
are 1, 2, 3, 4, 5, 6. These 6 
numbers form the longest consecutive
subsquence.
Example 2:
Input:
N = 7
a[] = {1,9,3,10,4,20,2}
Output:
4
Explanation:
1, 2, 3, 4 is the longest
consecutive subsequence
*/

import java.util.Arrays;
import java.util.Scanner;

public class Array21 {
    public int longestConsecutive(int n, int a[]) {
        int i, j, temp;

        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }

            System.out.println("After sorting " + a[i]);
        }
        int b[] = new int[n];
        for (i = 0; i < n; i++) {
            b[i] = a[i];
        }
        int count = 2;
        int max = Integer.MIN_VALUE;
        for (i = 0; i < n - 1; i++) {

            if (b[i + 1] - b[i] == 1)
                count++;

            else if (b[i + 1] - b[i] == 0) {
                count = 1;
                continue;
            } else {
                count = 1;
            }
            if (count > max)
                max = count;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements in array ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Array21 obj = new Array21();
        int result = obj.longestConsecutive(n, a);
        System.out.println(result);
    }
}
