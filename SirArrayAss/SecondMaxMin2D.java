import java.util.Scanner;

public class SecondMaxMin2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of  rows array");
        int r = sc.nextInt();
        System.out.println("Enter the size of  columns array");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        int i;
        for (i = 0; i < arr.length; i++) {
            System.out.println("Enter " + arr[i].length + " element of " + (i + 1) + " row");
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum[] = new int[r];

        for (i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum[i] = sum[i] + arr[i][j];

            }
        }

        int max = 0, min = sum[0], secondmax = 0, secondmin = sum[arr.length - 1], temp1 = 0, temp2 = 0;
        for (i = 0; i < arr.length; i++) {
            if (max < sum[i]) {
                max = sum[i];
            }
            if (min > sum[i]) {
                min = sum[i];
            }
        }
        for (i = 0; i < arr.length; i++) {
            if (sum[i] < max && secondmax < sum[i]) {
                secondmax = sum[i];
                temp1 = i;

            }
            if (sum[i] > min && secondmin > sum[i]) {
                secondmin = sum[i];
                temp2 = i;

            }

        }
        System.out.println("Second maximum is " + secondmax);
        System.out.println("Second minimum is " + secondmin);
        System.out.println("Row index of second max " + temp1);
        System.out.println("Row index of second min " + temp2);
        for (int j = 0; j < arr.length; j++) {
            int swap = arr[temp1][j];
            arr[temp1][j] = arr[temp2][j];
            arr[temp2][j] = swap;

        }

        for (i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
