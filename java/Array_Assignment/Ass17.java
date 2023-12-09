
//Q.17 Write a Java program to find duplicate values in an array of string values.
import java.util.Scanner;

public class Ass17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i])
                    System.out.println("The duplicate value is " + arr[i]);

            }

        }
    }
}
