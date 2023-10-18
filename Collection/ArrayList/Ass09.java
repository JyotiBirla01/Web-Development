/*Q.8
Given an unsorted array arr[] of size N having both negative and positive integers. The task is place all negative element at the end of array without changing the order of positive element and negative element.

Example 1:
Input : 
N = 8
arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
Output : 
1  3  2  11  6  -1  -7  -5

Example 2:
Input : 
N=8
arr[] = {-5, 7, -3, -4, 9, 10, -1, 11}
Output :
7  9  10  11  -5  -3  -4  -1 */

import java.util.ArrayList;
import java.util.Scanner;

public class Ass09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }
        int position=0;
        for(int i=0; i<n; i++){
            if(al.get(i)>=0){
                int temp=al.get(i);
                al.remove(i);
                al.add(position,temp);
                position++;

            }
        }
        System.out.println("After changing in array");
        for (Integer integer : al) {
            System.out.println((integer));
        }

    
}
}