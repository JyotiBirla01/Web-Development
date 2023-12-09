// Q.7 Sub array with given sum
// Given an unsorted array A of size N that contains only non-negative integers, find a
// continuous sub-array which adds to a given number S.

// Example 1:
// Input:
// N = 5, S = 12
// A[] = {1,2,3,7,5}
// Output: 2 4
// Explanation: The sum of elements 
// from 2nd position to 4th position 
// is 12.

// Example 2:
// Input:
// N = 10, S = 15
// A[] = {1,2,3,4,5,6,7,8,9,10}
// Output: 1 5

import java.util.Scanner;

public class Array8 {
    public void subArray(int n, int arr[], int sum) {
        int currentSum = 0;
        boolean flag = false;
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = i + 1, currentSum = arr[i]; j < n; j++) {
                currentSum += arr[j];
                if (currentSum == sum) {
                    // System.out.println((i + 1) + " " + (j + 1));
                    flag = true;

                }
            }
            if (flag)
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of sum");
        int sum = sc.nextInt();
        Array8 obj = new Array8();
        obj.subArray(n, arr, sum);

    }

}
