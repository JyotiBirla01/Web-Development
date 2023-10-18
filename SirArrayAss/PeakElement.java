import java.util.Scanner;
// Q.1 Peak an element

// An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).
// Given an array arr[] of size N, find the index of any one of its peak elements.
// Note: The generated output will always be 1 if the index that you return is correct. Otherwise output will be 0.

// Example 1:
// Input:
// N = 3
// arr[] = {1,2,3}
// Output: 1
public class PeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int s = sc.nextInt();
        int arr[] = new int[s];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the  " + i + " element");
            arr[i] = sc.nextInt();
        }

        boolean flag = false;
        System.out.println("Peak element is ");

        for (int i = 1; i < s - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1])
                flag = true;

        }

        if (arr[0] > arr[1])
            flag = true;

        if (arr[s - 1] > arr[s - 2])
            flag = true;

        if (flag) {
            System.out.println("1");

        } else {
            System.out.println("0");
        }

    }

}
