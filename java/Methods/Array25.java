//24. Write a Java program to swap first and last element of an integer 1-d array.

import java.util.Scanner;

public class Array25 {
    public int[] swap(int n, int a[]) {
        for (int i = 0; i < n; i++) {
            int temp = a[0];
            a[0] = a[n - 1];
            a[n - 1] = temp;
        }
        return a;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements in array ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Array25 obj = new Array25();
        int result[] = obj.swap(n, a);
        System.out.println("Afteer swapping first and last element of an integer 1-d array.");
        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
    }
}
