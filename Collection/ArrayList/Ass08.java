/*Q.7 Sub array with given sum
Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.

Example 1:
Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements 
from 2nd position to 4th position 
is 12.

Example 2:
Input:
N = 10, S = 15
A[] = {1,2,3,4,5,6,7,8,9,10}
Output: 1 5
Explanation: The sum of elements 
from 1st position to 5th position
is 15.
1 <= N <= 105
1 <= Ai <= 109
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Ass08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size ");
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>(n);
        System.out.println("Enter the elements ");
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }
        System.out.println("Enter the value of sum");
        int sum = sc.nextInt();
        int i, j, currentsum = 0;
        boolean flag = false;
        for (i = 0; i < n; i++) {

            for (j = i, currentsum = 0; j < n; j++) {
                currentsum += al.get(j);
                if (currentsum == sum) {
                    System.out.println("The sum of element from " + (i + 1) +  " position " + (j + 1) + " is " + sum);
                    flag = true;
                }
            }
            if (flag)
                break;
        }
        if (flag == false)
            System.out.println("No sub array found");

    }

}
