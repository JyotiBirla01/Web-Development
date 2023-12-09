/*Q.19) Find Maximum product contigeous sub array 

Given an array Arr[] that contains N integers (may be positive, negative or zero). Find the product of the maximum product subarray.
Example 1:
Input:
N = 5
Arr[] = {6, -3, -10, 0, 2}
Output: 180
Explanation: Subarray with maximum product
is [6, -3, -10] which gives product as 180.
Example 2:
Input:
N = 6
Arr[] = {2, 3, 4, 5, -1, 0}
Output: 120
Explanation: Subarray with maximum product
is [2, 3, 4, 5] which gives product as 120. */

import java.util.ArrayList;
import java.util.Scanner;

public class Ass19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }
        int product = 1, max = 0;
        for (int i = 0; i < al.size(); i++) {
            
            for (int j = i; j < al.size(); j++) {
                product = 1;
                for (int j2 = i; j2 <= j; j2++) {
                    product = product * al.get(j2);
                    if (product > max)
                        max = product;
                }
        

            }

        }
        System.out.println("Max product is " + max);

    }

}
