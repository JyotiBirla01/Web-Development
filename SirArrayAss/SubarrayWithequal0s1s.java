
// Q.15
// Sub with equal 0s and 1s
// Given an array containing 0s and 1s. Find the number of subarrays having equal number of 0s and 1s. 
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
// Explanation: The index range for the 
// subarray is (3,4).
import java.util.Scanner;

public class SubarrayWithequal0s1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int countOne = 0, countZero = 0, p, totalcount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                countOne = 0;
                countZero = 0;
                for (p = i; p <= j; p++) {
                    if (arr[p] == 1)
                        countOne++;
                    else
                        countZero++;
                }
                if (countOne == countZero)
                    totalcount++;

            }
        }
        System.out.println(" Total subarray " + totalcount);
    }

}
