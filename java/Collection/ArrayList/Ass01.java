/*

Q.1 Peak an element

An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).
Given an array arr[] of size N, find the index of any one of its peak elements.
Note: The generated output will always be 1 if the index that you return is correct. Otherwise output will be 0.

Example 1:
Input:
N = 3
arr[] = {1,2,3}
Output: 1
Explanation: index 2 is 3.
It is the peak element as it is 
greater than its neighbour 2.
Example 2:
Input:
N = 2
arr[] = {3,4}
Output: 1
Explanation: 4 (at index 1) is the 
peak element as it is greater than 
its only neighbour element 3.
Constraints:
1 ≤ N ≤ 105
1 ≤ A[] ≤ 106 */

import java.util.ArrayList;

class Ass01 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
       boolean flag = false;
System.out.println("Peak element is ");
         for (int i=1; i<list.size()-1; i++) {
            if (list.get(i) > list.get(i-1) && list.get(i) > list.get(i+1))
                flag = true;

        }

        if (list.get(0) > list.get(1))
            flag = true;

        if (list.get(list.size()-1) > list.get(list.size()-2))
            flag = true;

        if (flag) {
            System.out.println("1");

        } else {
            System.out.println("0");
        }

    }
}
