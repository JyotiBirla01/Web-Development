
//36. Write a java program to implement Selection sort algorithm
import java.util.Scanner;

public class Insertionsort {
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
        for (i = 1; i < n; i++) {
            j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {

                temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }

        }

        for (int k : arr) {
            System.out.println(k);
        }

    }

}
