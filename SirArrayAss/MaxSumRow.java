import java.util.Scanner;

public class MaxSumRow {
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
        int x[] = new int[r];
        int maxrow = 0, temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                x[i] = x[i] + arr[i][j];

            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (maxrow < x[i]) {
                maxrow = x[i];
                temp = i;
            }
            System.out.println((temp + 1) + "rd row has " + maxrow + " max row sum");
            System.out.println((temp + 1) + "rd row element is :- ");
            for (int j = 0; j < arr[temp].length; j++) {
                System.out.println(arr[temp][j]);
            }
        }
    }

}
