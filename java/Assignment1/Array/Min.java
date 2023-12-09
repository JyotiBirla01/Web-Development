import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int arr[][] = new int[2][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println("Enter the element");
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(" " + arr[i][j]);
                if (arr[i][j] > max)
                    max = arr[i][j];

            }
            System.out.println();

        }
        System.out.println(" The maximum number is " + max);

    }

}
