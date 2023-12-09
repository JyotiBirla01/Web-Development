//23. Write a Java program to find the sum and average of one dimensional integer array. 

import java.util.Scanner;

public class Array24 {
    public int sum(int n, int a[]) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        return sum;
    }

    public float average(int n, int a[]) {
        int sum = 0;
        float avg = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            avg = sum / 2f;
        }
        return avg;

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
        Array24 obj = new Array24();
        int result = obj.sum(n, a);
        float ans = obj.average(n, a);
        System.out.println(result);
        System.out.println(ans);

    }
}
