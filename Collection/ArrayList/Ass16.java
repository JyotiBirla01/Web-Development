/*
Sub with equal 0s and 1s
Given an array containing 0s and 1s. Find the number of subarrays having equal number of 0s and 1s. 
Example 1:
Input:
n = 7
A[] = {1,0,0,1,0,1,1}
Output: 8
Explanation: The index range for the 8 
sub-arrays are: (0, 1), (2, 3), (0, 3), (3, 4), 
(4, 5) ,(2, 5), (0, 5), (1, 6)
Example 2:
Input:
n = 5
A[] = {1,1,1,1,0}
Output: 1
Explanation: The index range for the 
subarray is (3,4)*/

import java.util.ArrayList;
import java.util.Scanner;

public class Ass16 {
    public Integer subArray(ArrayList<Integer> al) {
        int count1 = 0, count0 = 0, total = 0;

        for (int i = 0; i < al.size(); i++) {

            for (int j = i; j < al.size(); j++) {
                count0=0;
                count1=0;
                for (int j2 = i; j2 <= j; j2++) {
                    if (al.get(j2) == 1)
                        count1++;
                    else
                        count0++;
                }
                System.out.println();
                if (count0 == count1)
                    total++;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        while (true) {
            int n = sc.nextInt();
            if (n == -1)
                break;
            al.add(n);
        }
        Ass16 obj = new Ass16();
        System.out.println(" The number of subarrays having equal number of 0s and 1s");
        int result = obj.subArray(al);
        System.out.println(result);

    }
}
