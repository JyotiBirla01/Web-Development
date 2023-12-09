import java.util.Scanner;

public class Array_Min {
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
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = j + 1; k < arr[i].length; k++) {
                    if (arr[i][j] < min)
                        min = arr[i][j];

                }
            }

        }
        System.out.print("  Minimum is " + min);
    }

}
