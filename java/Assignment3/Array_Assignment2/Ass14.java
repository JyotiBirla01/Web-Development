//Q.14 Find Subarray with given sum | Set 1 (Non-negative Numbers

import java.util.Scanner;
//Q.14 Find Subarray with given sum | Set 1 (Non-negative Numbers)
// Given an array arr[] of non-negative integers and an integer sum, find a 
// subarray that adds to a given sum.
// Note: There may be more than one subarray with sum as the given sum, print 
// first such subarray.

public class Ass14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter the elements in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of sum");
        int sum = sc.nextInt();

        int i, j = 0;
        int currentSum;
        boolean flag = true;
        for (i = 0; i < arr.length; i++) {
            for (j = i + 1, currentSum = arr[i]; j < arr.length; j++) {
                currentSum += arr[j];

                if (currentSum == sum) {
                    System.out.println("Sum of elements between indices " + i + " and " + j + " is");
                    flag = false;
                    break;
                }
            }

        }
        if (flag == true) {
            System.out.println(" No subarray found");

        }

    }

}
