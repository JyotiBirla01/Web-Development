
// Q.1 Write a program to make a Jagged Array
import java.util.Scanner;

public class Ass1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of rows ");
        int r = sc.nextInt();
        int arr[][] = new int[r][];
        System.out.println("Enter the size of column ");
        for (int i = 0; i < arr.length; i++) {
            int c = sc.nextInt();
            arr[i] = new int[c];
        }
        System.out.println("Enter the elements in a array ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        System.out.println("Jagged array is ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
    }

}
