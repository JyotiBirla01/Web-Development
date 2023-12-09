// Q.8
// Given an unsorted array arr[] of size N having both negative and positive integers.
// The task is place all negative element at the end of array without changing the 
//order of positive element and negative element.

// Example 1:
// Input : 
// N = 8
// arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
// Output : 
// 1  3  2  11  6  -1  -7  -5

// Example 2:
// Input : 
// N=8
// arr[] = {-5, 7, -3, -4, 9, 10, -1, 11}
// Output :
// 7  9  10  11  -5  -3  -4  -1

import java.util.Scanner;

public class Array9 {
    public void positiveNegative(int n, int arr[], int temp[]) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                temp[j++] = arr[i];
            }

        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                temp[j++] = arr[i];
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.println(temp[i]);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int temp[] = new int[n];
        System.out.println("After changing array ");
        Array9 obj = new Array9();
        obj.positiveNegative(n, arr, temp);

    }

}
