
// Q.16
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

public class Array17 {
    public int[] alternatePosNeg(int n, int arr[], int ans[]) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0)
                ans[j++] = arr[i];

            else
                ans[j++] = arr[i];

        }
        for (int i = 0; i < n; i++) {
            System.out.println(ans[i]);
        }
        while (ans[n - 1] < 0) {
            n--;

        }
        n += 1;
        System.out.println(n);
        int k = 1, temp = 0;

        while (k < ans.length - 1 && n <= ans.length - 1) {
            temp = ans[n];
            for (int i = n; i > k; i--) {
                ans[i] = ans[i - 1];
            }
            ans[k] = temp;
            k += 2;
            n++;
        }
        for (int i : ans) {
            System.out.println(i);
        }
        return ans;
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
        int ans[] = new int[n];

        Array17 obj = new Array17();
        System.out.println("The array in alternating positive and negative items ");
        int result[] = obj.alternatePosNeg(n, arr, ans);
        System.out.println(result);

    }

}
