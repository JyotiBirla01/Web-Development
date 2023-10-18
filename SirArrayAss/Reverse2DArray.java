import java.util.Scanner;

public class Reverse2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of  rows array");
        int r = sc.nextInt();
        System.out.println("Enter the size of  columns array");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        for (r = 0; r < arr.length; r++) {
            System.out.println("Enter " + arr[r].length + " element of " + (r + 1) + " row");
            for (c = 0; c < arr[r].length; c++) {
                arr[r][c] = sc.nextInt();
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = arr.length - 1; j >= 0; j--) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }

    }
}