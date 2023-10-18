// Q.17 Find it there is any subarray with sum equals to zero
// Given an array of positive and negative numbers. Find if there is a subarray (of size at-
//least one) with 0 sum.
// Example 1:
// Input:
// 5
// 4 2 -3 1 6

// Output: 
// Yes

// Explanation: 
// 2, -3, 1 is the subarray 
//:Example 2:
// Input:
// 5
// 4 2 0 1 6

//Output: 
//Yes
// Input:

import java.util.Scanner;

public class SubarrayWithSumEqutoZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int i, j, sum;
        boolean flag = true;
        for (i = 0; i < arr.length; i++) {
            for (j = i + 1, sum = arr[i]; j < n; j++) {
                sum = sum + arr[j];
            }
            if (sum == 0 || arr[i] == 0) {
                flag = false;
                System.out.println("yes");

            }

        }
        if (flag)

            System.out.println("No");

    }
}
