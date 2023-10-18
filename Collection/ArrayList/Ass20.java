/*.20 Longest consecutive sequence.
Given an array of positive integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.
 
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
consecutive subsequence. */

import java.util.ArrayList;
import java.util.Scanner;

public class Ass20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());

        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (al.get(i) > al.get(j)) {
                    int temp = al.get(i);
                    al.set(i, al.get(j));
                    al.set(j, temp);
                }
            }
        }
        int count = 1;
        for (int i = 0; i < n-1; i++) {
            if (al.get(i + 1) - al.get(i) == 1)
                count++;

        }
        System.out.println("Longest consecutive sequence  " + count);

    }

}
