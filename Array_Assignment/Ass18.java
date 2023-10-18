
//.18 Write a Java program to add two matrices of the same size.
import java.util.Scanner;

public class Ass18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row element of array1");
        int n1 = sc.nextInt();
        System.out.println("Enter the column of array1");
        int n2 = sc.nextInt();

        int arr1[][] = new int[n1][n2];
        System.out.println("Enter the row of array2");
        int n3 = sc.nextInt();
        System.out.println("Enter the column of array2");
        int n4 = sc.nextInt();
        int arr2[][] = new int[n3][n4];
        System.out.println("Enter the elements of array1");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                arr1[i][j] = sc.nextInt();

            }
        }
        // System.out.println("The data you entered");
        // for (int i = 0; i < n1; i++) {
        // for (int j = 0; j < n2; j++) {
        // System.out.print(" " + arr1[i][j]);
        // }
        // System.out.println();
        // }
        System.out.println("Enter the elements of array2");
        for (int i = 0; i < n3; i++) {
            for (int j = 0; j < n4; j++) {
                arr2[i][j] = sc.nextInt();

            }
        }
        System.out.println("The data you entered of array1");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(" " + arr1[i][j]);
            }
            System.out.println();
        }
        System.out.println("The data you entered of array2 ");
        for (int i = 0; i < n3; i++) {
            for (int j = 0; j < n4; j++) {
                System.out.print(" " + arr2[i][j]);
            }
            System.out.println();
        }
        System.out.println("The sum of two array is ");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {

                System.out.print(" " + arr1[i][j] + arr2[i][j]);
            }
            System.out.println();
        }
    }

}
