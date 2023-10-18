// Q.8
// Given an unsorted array arr[] of size N having both negative and positive integers. 
//The task is place all negative element at the end of array without changing the order of
// positive element and negative element.

// Example 1:
// Input : 
// N = 8
// arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
// Output : 
// 1  3  2  11  6  -1  -7  -5

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int j = 0;

         int temp[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                temp[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                temp[j] = arr[i];
                j++;
            }
        }
        System.out.println("After changing in array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(temp[i]);
        }

    }

}
