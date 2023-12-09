
//36. Write a java program to implement bubble sort algorithm
import java.util.Scanner;

public class Bubblesort {
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
            boolean flag = false;
            for (j = 0; j < n - i - 1; j++) { 
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;

                }
            }
            if (!flag) {
                // System.out.println(arr[i]);

            }

        }

        for (int k = 0; k < n; k++) {
            System.out.println(arr[k]);
        }

    }

}
