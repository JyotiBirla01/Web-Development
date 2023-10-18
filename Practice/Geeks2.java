
/*Given an array A of positive integers. Your task is to find the leaders in the array. An element of array is leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader. 

Example 1:

Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17 
as it is greater than all the elements
to its right.  Similarly, the next 
leader is 5. The right most element 
is always a leader so it is also 
included.
 */
import java.util.Scanner;

class A {
    public void array(int arr[], int n) {

        int max = arr[n - 1];
        for (int i = n-1; i >= 0; i--) {
            if (max <= arr[i]) {
                max = arr[i];
                System.out.println("Leader is "+max);
            }

        }

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
