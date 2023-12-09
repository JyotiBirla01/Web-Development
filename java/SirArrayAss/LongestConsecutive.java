
// Q.20 Longest consecutive sequence.
// Given an array of positive integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.
//  
// Example 1:
// Input:
// N = 7
// a[] = {2,6,1,9,4,5,3}
// Output:
// 6
// Explanation:
// The consecutive numbers here
// are 1, 2, 3, 4, 5, 6. These 6 
// numbers form the longest consecutive
// subsquence.
import java.util.Scanner;

public class LongestConsecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int i, j, temp;

        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }

            System.out.println("After sorting " + arr[i]);
        }
        int count = 1;
        int max_count = Integer.MIN_VALUE;
        for (i = 0; i < n - 1; i++) {
            if (arr[i + 1] - arr[i] == 1) {
                count++;
            } else if (arr[i + 1] - arr[i] == 0) {
                continue;
            } else {
                count = 1;

            }

            if (max_count < count)
                max_count = count;

        }

        System.out.println("Longest Consecutive subsequence: " + max_count);

    }
}