//Q.10.
//Write a program to cyclically rotate array by one.

import java.util.Scanner;

public class Array11 {
    public static void rotateArray(int n, int a[], int k) {
        for (int i = 0; i < n; i++) {
            if (i < k)
                System.out.print(a[n + i - k] + " ");
            else
                System.out.print(a[i - k] + " ");
        }

    }

}

class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + " element of array ");
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the value of  k");
        int k = sc.nextInt();
        System.out.println("Your output is ");
        Array11.rotateArray(n, a, k);

    }
}
