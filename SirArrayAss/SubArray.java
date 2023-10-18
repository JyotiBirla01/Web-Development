// Q.7 Sub array with given sum
// Given an unsorted array A of size N that contains only non-negative integers, find a 
//continuous sub-array which adds to a given number S.

// Example 1:
// Input:
// N = 5, S = 12
// A[] = {1,2,3,7,5}
// Output: 2 4
// Explanation: The sum of elements 
// from 2nd position to 4th position 
// is 12.
import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int i, j, currentsum;
        System.out.println("Enter the sum  ");
        int sum = sc.nextInt();

        boolean flag = false;
        for (i = 0; i < arr.length; i++) {
            for (j = i, currentsum = 0; j < arr.length; j++) {
                currentsum += arr[j];
                if (currentsum == sum) {
                    flag = true;
                    System.out.println((i + 1) + ", " + (j + 1));

                }

            }
            if (flag) {
                break;
            }
        }
        if (flag == false)
            System.out.println("No sub array found ");
    }

}
