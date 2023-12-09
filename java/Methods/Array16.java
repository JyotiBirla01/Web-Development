// Q.15
// Sub with equal 0s and 1s
// Given an array containing 0s and 1s. Find the number of subarrays having equal number
// of 0s and 1s. 
// Example 1:
// Input:
// n = 7
// A[] = {1,0,0,1,0,1,1}
// Output: 8
// Explanation: The index range for the 8 
// sub-arrays are: (0, 1), (2, 3), (0, 3), (3, 4), 
// (4, 5) ,(2, 5), (0, 5), (1, 6)
// Example 2:
// Input:
// n = 5
// A[] = {1,1,1,1,0}
// Output: 1

import java.util.Scanner;

public class Array16 {
    public int equal(int n, int arr[]) {
        int i, j, totalcount = 0;
        for (i = 0; i < n; i++) {

            for (j = i + 1; j < n; j++) {
                int countZero = 0, countOne = 0;
                for (int k = i; k <= j; k++) {
                    if (arr[k] == 1)
                        countOne++;
                    else
                        countZero++;
                }
                if (countOne == countZero) {
                    totalcount++;
                }
            }

        }
        return totalcount;
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
        Array16 obj = new Array16();
        System.out.println("The number ofsubarrays having equal number of 0s and 1s is  ");
        int result = obj.equal(n, arr);
        System.out.println(result);

    }

}
