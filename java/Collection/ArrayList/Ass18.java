/*Q.17 Find it there is any subarray with sum equals to zero
Given an array of positive and negative numbers. Find if there is a subarray (of size at-least one) with 0 sum.
Example 1:
Input:
5
4 2 -3 1 6

Output: 
Yes

Explanation: 
2, -3, 1 is the subarray 
with sum 0.
Example 2:
Input:
5
4 2 0 1 6

Output: 
Yes

Explanation: 
0 is one of the element 
in the array so there exist a 
subarray with sum 0.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Ass18 {
    public void subArray(ArrayList<Integer> al, int n) {
        int i, j, sum = 0;
        boolean flag = false;
        for (i = 0; i < n; i++) {
            for (j = i + 1, sum = 0; j < n; j++) {
                sum += al.get(j);

            }
            if (sum == 0 || al.get(i) == 0) {
                flag = false;
                System.out.println("Yes ");

            }
        }
        if (flag)
            System.out.println("No ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size ");
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }
        Ass18 obj = new Ass18();
        obj.subArray(al, n);

    }
}