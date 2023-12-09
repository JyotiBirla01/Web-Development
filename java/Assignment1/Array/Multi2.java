import java.util.Scanner;

public class Multi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows  ");
        int n1 = sc.nextInt();
        System.out.println("Enter the number of columns  ");
        int n2 = sc.nextInt();
        int a[][] = new int[n1][n2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.println("Enter the data ");
                a[i][j] = sc.nextInt();

            }
        }
        System.out.print("\nData you entered : \n");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println();
        }

    }

}
