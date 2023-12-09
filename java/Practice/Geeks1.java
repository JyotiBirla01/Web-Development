
/*Given an unsorted array A of size N that contains only positive integers, find a continuous sub-array that adds to a given number S and return the left and right index(1-based indexing) of that subarray.

In case of multiple subarrays, return the subarray indexes which come first on moving from left to right.

Note:- You have to return an ArrayList consisting of two elements left and right. In case no such subarray exists return an array consisting of element -1.

Example 1:

Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4 */
import java.util.Scanner;

class A {
    public void array(int arr[], int n, int s) {
        int i, sum = 0, start = 0, end = 0;
        
        for (i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            end = i;

            while (sum > s && start < end) {
                sum -= arr[start];
                start++;

            }
            if (s == sum) {
                break;
            }
        }
       
        if (s != sum)
            System.out.println("-1");
        else
            System.out.println((start + 1) + " , " + (end + 1));

        // return sum;

    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        System.out.println("Enter the elements ");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the sum of element ");
        int s = sc.nextInt();
        A obj = new A();
        // System.out.println(obj.array(arr, n, s));
        obj.array(arr, n, s);
    }
}
