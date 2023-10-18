
//Q.3 Write a program for Swapping Two Arrays .
import java.util.Scanner;

public class Ass3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array1 ");
        int n = sc.nextInt();
        System.out.println("Enter the size of array2 ");
        int n2 = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n2];
        System.out.println("Enter the elements in array1 ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the elements in array2 ");
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = sc.nextInt();
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                int temp = 0;
                temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
            }
        }
        System.out.println("Swapping of array is ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }

}
