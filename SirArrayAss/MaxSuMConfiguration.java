// Q.21 Max Sum in configuration

// Given an array(0-based indexing), you have to find the max sum of i*A[i] where A[i] is the element at index i in the array.The only operation allowed is to rotate(clock-wise or counter clock-wise) the array any number of times.
// Example 1:
// Input:
// N = 4
// A[] = {8,3,1,2}
// Output: 29
// Explanation: Above the configuration
// possible by rotating elements are
// 3 1 2 8 here sum is 3*0+1*1+2*2+8*3 = 29
// 1 2 8 3 here sum is 1*0+2*1+8*2+3*3 = 27
// 2 8 3 1 here sum is 2*0+8*1+3*2+1*3 = 17
// 8 3 1 2 here sum is 8*0+3*1+1*2+2*3 = 11
// Here the max sum is 29
import java.util.Scanner;

class MaxSumConfiguration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in  array ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int i, j = 0, k = 0, sum = 0, max = Integer.MIN_VALUE;
        ;

        int ans[] = new int[n];
        for (k = 0; k < n; k++) {
            for (i = n - k, j = 0; i < n; i++) {
                ans[j++] = arr[i];
            }
            for (i = 0; i < n - k; i++) {
                ans[j++] = arr[i];
            }
            sum = 0;
            for (i = 0; i < n; i++) {
                sum = sum + ans[i] * i;
                // System.out.println("Max sum congiguration " + sum);

            }
            if (sum > max)
                max = sum;

        }
        System.out.println("Max sum is " + sum);

    }
}
