
// Write a java progrtam to implement insertion sort algorithm
import java.util.Scanner;

public class Array37 {
    public void insertionSort(int n, int a[]) {
        int i, j, temp;
        for (i = 1; i < n; i++) {

            j = i;
            while (j > 0 && a[j - 1] > a[j]) {
                temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;
                j--;

            }

        }
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements in array in sorted order");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Array37 obj = new Array37();
        obj.insertionSort(n, a);

    }
}