
//36. Write a java program to implement Selection sort algorithm
import java.util.Scanner;

public class Selectionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int i, j, temp;
        System.out.println("After sorting array");
        for (i = 0; i < n - 1; i++) {
            int min_index = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }

            }

            temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;

        }

        for (int k = 0; k < n; k++) {
            System.out.println(arr[k]);
        }

    }

}
