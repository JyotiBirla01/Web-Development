/*Q.11 Count pair with given sum.
Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.

Example 1:
Input:
N = 4, K = 6
arr[] = {1,5,7,1}
Output: 2
Explanation: 
arr[0] + arr[1] = 1 + 5 = 6 
and arr[1] + arr[3] = 5 + 1 = 6.

Example 2:
Input:
N = 4, X = 2
arr[] = {1, 1, 1, 1}
Output: 6
Explanation:
Each 1 will produce sum 2 with any 1. */

import java.util.ArrayList;
import java.util.Scanner;

class Ass12 {
    public static void noOfPairElement(ArrayList<Integer> al, int sum) {
        int count = 0;
        for (int i = 0; i < al.size(); i++) {
            for (int j = i + 1; j < al.size(); j++) {
                if (al.get(i) + al.get(j) == sum) {
                    System.out.println("sum of " + al.get(i) + " and " + al.get(j) + " is " + sum);
                    count++;
                    System.out.println(count);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("For exit enter 0 ");
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            al.add(n);
        }
        System.out.println("Enter the value of sum");
        int sum = sc.nextInt();
        noOfPairElement(al, sum);
    }
}