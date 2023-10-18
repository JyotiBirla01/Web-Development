// Given two arrays a[] and b[] of size n and m respectively. The task is to find union between these two arrays. 
// Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there are repetitions, then only one occurrence of element should be printed in the union.
// Example 1:
// Input:
// 5 3
// 1 2 3 4 5
// 1 2 3
// Output: 
// 5
// Explanation: 
// 1, 2, 3, 4 and 5 are the
// elements which comes in the union set
// of both arrays. So count is 5.
// Example 2:
// Input:
// 6 2 
// 85 25 1 32 54 6
// 85 2 
// Output: 
// 7
// Explanation: 
// 85, 25, 1, 32, 54, 6, and
// 2 are the elements which comes in the
// union set of both arrays. So count is 7.

import java.util.Scanner;

public class Array10 {
    int j = 0;

    public int union(int n1, int n2, int arr1[], int arr2[], int temp[]) {
        int count = 0;
        for (int i = 0; i < temp.length; i++) {
            if (i < n1) {
                temp[i] = arr1[i];

            } else {
                temp[i] = arr2[j++];
            }

        }
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (temp[i] == temp[j])
                    break;

            }
            if (i == j) {
                System.out.println("distinct element " + temp[j]);
                count++;
            }
        }
        return count;
    }

}

class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array1 ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.println("Enter the elements in array1 ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of array2");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter the elements in array2 ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        int temp[] = new int[n1 + n2];

        Array10 obj = new Array10();
        System.out.println("The union of  array is  ");
        int result = obj.union(n1, n2, arr1, arr2, temp);
        System.out.println(result);

    }
}