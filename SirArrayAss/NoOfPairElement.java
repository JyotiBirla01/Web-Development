// //Q.11 Count pair with given sum.
// Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.

// Example 1:
// Input:
// N = 4, K = 6
// arr[] = {1,5,7,1}
// Output: 2
// Explanation: 
// arr[0] + arr[1] = 1 + 5 = 6 
// and arr[1] + arr[3] = 5 + 1 = 6.

// Example 2:
// Input:
// N = 4, X = 2
// arr[] = {1, 1, 1, 1}
// Output: 6
import java.util.Scanner;

public class NoOfPairElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the " + (i + 1) + " element in array ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k");
        int k = sc.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    System.out.println("sum of " + arr[i] + " and " + arr[j] + " is " + k);
                    count++;
                    break;
                }
            }

        }
        System.out.println("Count is " + count);

    }

}
