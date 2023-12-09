
//Write a java program to implement bubble sort algorithm
import java.util.Scanner;

public class Array36 {
    public void bubbleSort(int n, int a[]) {
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
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
        Array36 obj = new Array36();
        obj.bubbleSort(n, a);

    }
}