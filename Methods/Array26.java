
//Write a Java program to reverse the element of an integer 1-D array. 
import java.util.Scanner;

public class Array26 {
    public int[] reverse(int n, int a[]) {
        for (int i = 0; i < n / 2; i++) {
            int temp = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = temp;
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

        Array26 obj = new Array26();
        int result[] = obj.reverse(n, a);
        System.out.println("Afteer swapping first and last element of an integer 1-d array.");
        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
    }
}
