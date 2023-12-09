
/*Find largest sum contigeous sub array
Given an array Arr[] of N integers. Find the contiguous sub-array(containing at 
//least one number) which has the maximum sum and return its sum.

Example 1:
Input:
N = 5
Arr[] = {1,2,3,-2,5}
Output:
9
Explanation:
Max subarray sum is 9
of elements (1, 2, 3, -2, 5) which 
is a contiguous subarray.
Example 2:
Input:
N = 4
Arr[] = {-1,-2,-3,-4}
Output:
-1
Explanation:
Max subarray sum is -1 
of element*/
import java.util.Scanner;

public class Array19 {
    public int largestSum(int a[], int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i, sum = 0; j < n; j++) {
                sum += a[j];
                if (sum > max)
                    max = sum;
            }
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
        Array19 obj = new Array19();
        int result = obj.largestSum(a, n);
        System.out.println(result);

    }

}
