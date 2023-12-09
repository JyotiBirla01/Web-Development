// Q.17 Find it there is any subarray with sum equals to zero
// Given an array of positive and negative numbers. Find if there is a subarray (of size
// at-least one) with 0 sum.
// Example 1:
// Input:
// 5
// 4 2 -3 1 6

// Output: 
// Yes

// Explanation: 
// 2, -3, 1 is the subarray 
// with sum 0.
// Example 2:
// Input:
// 5
// 4 2 0 1 6

// Output: 
// Yes

// Explanation: 
// 0 is one of the element 
// in the array so there exist a 
// subarray with sum 0.

import java.util.Scanner;

public class Array18 {
    public String subArray(int arr[]) {
        boolean flag = true;
        int i = 0, j = 0, sum = 0;
        for (i = 0; i < arr.length; i++) {
            for (j = i + 1, sum = arr[i]; j < arr.length; j++) {
                sum += arr[j];
            }
            if (sum == 0 || arr[i] == 0) {
                flag = false;
                break;
            }
        }

        if (flag)
            return "yes";
        else
            return "No";

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in array ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans[] = new int[n];

        Array18 obj = new Array18();
        String result = obj.subArray(arr);
        System.out.println(result);

    }

}
