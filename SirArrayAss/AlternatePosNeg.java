
// Rearrange the array in alternating positive and negative items
// Given an unsorted array Arr of N positive and negative numbers. Your task is to create an array of alternate positive and negative numbers without changing the relative order of positive and negative numbers.
// Note: Array should start with positive number.

// Example 1:
// Input: 
// N = 9
// Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
// Output:
// 9 -2 4 -1 5 -5 0 -3 2
// Example 2:
// Input: 
// N = 10
// Arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
// Output:
// 5 -5 2 -2 4 -8 7 1 8 0 

import java.util.Scanner;

// public class AlternatePosNeg {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of array");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.println("Enter the elements ");
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();

//         }

//         int ans[] = new int[n];
//         int j = 0;
//         for (int i = 0; i < n; i++) {
//             if (arr[i] >= 0) {
//                 ans[j++] = arr[i];

//             }
//         }

//         for (int i = 0; i < n; i++) {
//             if (arr[i] < 0) {
//                 ans[j++] = arr[i];

//             }
//         }

//         while (ans[n - 1] < 0) {
//             n--;

//         }

//         int k = 1, temp = 0;

//         while (k < ans.length - 1 && n <= ans.length - 1) {
//             temp = ans[n];
//             for (int i = n; i > k; i--) {
//                 ans[i] = ans[i - 1];
//             }
//             ans[k] = temp;
//             k += 2;
//             n++;
//         }
//         System.out.println("After changing in array ");
//         for (int i : ans) {
//             System.out.print(i + " ");
//         }

//     }
// }
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int temp[] = new int[n];
        int j = 0;
        int positiveIndex = 0, negativeIndex = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                temp[positiveIndex] = arr[i];
                positiveIndex+=2;

            } else if (arr[i] < 0) {
                temp[negativeIndex] = arr[i];
                negativeIndex+=2;
            }
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}