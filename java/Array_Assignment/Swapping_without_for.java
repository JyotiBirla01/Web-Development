
//Write a program to swaping array.
import java.util.Scanner;

public class Swapping_without_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[5];
        int arr2[] = new int[5];
        System.out.println("Enter the elements in array1");
        int i = 0;
        for (i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements in array2 ");
        for (i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();

        }
        int arr3[] = new int[5];
        for (i = 0; i < 5; i++) {
            arr3[i] = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = arr3[i];
        }
        for (i = 0; i < 5; i++) {

            System.out.println("After Swapping array1 " + arr1[i]);
        }
        for (i = 0; i < 5; i++) {
            System.out.println("After Swapping array2 " + arr2[i]);
        }
    }
}