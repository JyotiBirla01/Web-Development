
/*Given an array A containing 2*N+2 positive numbers, out of which 2*N numbers exist in pairs whereas the other two number occur exactly once and are distinct. Find the other two numbers. Return in increasing order.

Example 1:

Input: 
N = 2
arr[] = {1, 2, 3, 2, 1, 4}
Output:
3 4 
Explanation:
3 and 4 occur exactly once.
Example 2:

Input:
N = 1 */
import java.util.Scanner;

class A {
    boolean flag = false;
    int i;

    public void array(int arr[], int n) {
        int res = arr[0];
        for (i = 1; i < arr.length; i++) {
            res = res ^ arr[i];

        }
        System.out.println("Single repeated element is " + res);

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

        A obj = new A();
        // System.out.println(obj.array(arr, n, s));
        obj.array(arr, n);
    }
}
