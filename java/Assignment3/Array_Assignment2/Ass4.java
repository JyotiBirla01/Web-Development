
//Q.4 Write a Java program to swap first and last element of an integer 1-d array.
import java.util.Scanner;

public class Ass4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements in array ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("After Swapping first and last element ");
        for (int i = 0; i < arr.length; i++) {

            int temp = 0;
            temp = arr[0];
            arr[0] = arr[size - 1];
            arr[size - 1] = temp;

            System.out.println(arr[i]);

        }

    }
}