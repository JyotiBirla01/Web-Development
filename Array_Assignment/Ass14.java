
//Q.14Write a program in to array size to be user input print it
import java.util.Scanner;

public class Ass14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The data you entered is ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}
