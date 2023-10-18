import java.util.Scanner;

public class Arraysort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of  rows array");
        int r = sc.nextInt();
        System.out.println("Enter the size of  columns array");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + arr[i].length + " element of " + (i + 1) + " row");
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = j + 1; k < arr[i].length; k++) {
                    if (arr[i][j] > arr[i][k]) {
                        arr[i][j] = arr[i][j] + arr[i][k];
                        arr[i][k] = arr[i][j] - arr[i][k];
                        arr[i][j] = arr[i][j] - arr[i][k];

                    }
                }
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
    }

}
