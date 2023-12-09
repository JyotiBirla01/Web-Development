
// Write a Java program to find the largest and smallest element of an array.
import java.util.Scanner;

public class Array27 {
    public int largest(int n, int a[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }

    public int smallest(int n, int a[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] < min)
                min = a[i];
        }
        return min;
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements in array ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Array27 obj = new Array27();
        System.out.println("Largest number is ");
        int maximum = obj.largest(n, a);
        System.out.println(maximum);
        System.out.println("Smallest numbert is ");
        int minimum = obj.smallest(n, a);
        System.out.println(minimum);

    }
}
