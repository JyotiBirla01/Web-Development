/*  Max Sum in configuration

Given an array(0-based indexing), you have to find the max sum of i*A[i] where A[i] is the element at index i in the array.The only operation allowed is to rotate(clock-wise or counter clock-wise) the array any number of times.
Example 1:
Input:
N = 4
A[] = {8,3,1,2}
Output: 29
Explanation: Above the configuration
possible by rotating elements are
3 1 2 8 here sum is 3*0+1*1+2*2+8*3 = 29
1 2 8 3 here sum is 1*0+2*1+8*2+3*3 = 27
2 8 3 1 here sum is 2*0+8*1+3*2+1*3 = 17
8 3 1 2 here sum is 8*0+3*1+1*2+2*3 = 11
Here the max sum is 29*/

import java.util.Scanner;

public class Array22 {
    public int Max_Sum_Confi(int n, int a[]) {
        int temp[] = new int[n];
        int i = 0, j = 0, sum = 0, max = Integer.MIN_VALUE;
        for (int k = 0; k < n; k++) {
            for (i = n - k, j = 0; i < n; i++) {
                temp[j++] = a[i];

            }
            for (i = 0; i < n - k; i++) {
                temp[j++] = a[i];

            }
            sum = 0;
            for (int l = 0; l < temp.length; l++) {

                sum = sum + temp[l] * l;
            }

            if (sum > max)
                max = sum;
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements in array ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Array22 obj = new Array22();
        int result = obj.Max_Sum_Confi(n, a);
        System.out.println(result);

    }
}
