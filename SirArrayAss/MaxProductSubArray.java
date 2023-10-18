// Q.19) Find Maximum sum contigeous sub array 

// Given an array Arr[] that contains N integers (may be positive, negative or zero). 
//Find the product of the maximum product subarray.
// Example 1:
// Input:
// N = 5
// Arr[] = {6, -3, -10, 0, 2}
// Output: 180
// Explanation: Subarray with maximum product
// is [6, -3, -10] which gives product as 180.
// Example 2:
// Input:
// N = 6
// Arr[] = {2, 3, 4, 5, -1, 0}
// Output: 120
// Explanation: Subarray with maximum product
// is [2, 3, 4, 5] which gives product as 120.
import java.util.Scanner;

public class MaxProductSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }

        int i, j;
        int product = 1;
        int max = Integer.MIN_VALUE;
        for (i = 0; i < n; i++) {
            for (j = i + 1, product = arr[i]; j < n; j++) {
                product *= arr[j];
                if (product > max) {
                    max = product;

                }
            }
        }
        System.out.println("Max Subarray is " + max);
    }
}