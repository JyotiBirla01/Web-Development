
//9.Initialize and print all elements of a 2D array.
import java.util.Scanner;

// Q.9 Find a peak element which is not smaller than its neighbours
// Given an array arr[] of integers. Find a peak element i.e. an element that is not
// smaller than its neighbors.
// Note: For corner elements, we need to consider only one neighbor.
// Example:
// Input: array[]= {5, 10, 20, 15}
// Output: 20
public class Ass9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        System.out.println("Enter the elements");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        System.out.println("The data you entered");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }

    }

}
