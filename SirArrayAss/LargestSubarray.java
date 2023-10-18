// Q.18) Find largest sum contigeous sub array
// Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one
// number) which has the maximum sum and return its sum.

// Example 1:
// Input:
// N = 5
// Arr[] = {1,2,3,-2,5}
// Output:
// 9
// Explanation:
// Max subarray sum is 9
// of elements (1, 2, 3, -2, 5) which 
// is a contiguous subarray.
// Example 2:
// Input:
// N = 4
// Arr[] = {-1,-2,-3,-4}
// Output:
// -1
import java.util.Scanner;

public class LargestSubarray {
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
        int currentSum = 0;
        int max = Integer.MIN_VALUE;
        for (i = 0; i < n; i++) {
            for (j = 0, currentSum = 0; j <= i; j++) {
                currentSum += arr[j];
                if (currentSum > max) {
                    max = currentSum;
                }
            }
        }

        System.out.println(max);

    }

}
