import java.util.Scanner;

public class SumOfMulti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int arr[][] = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Enter the elements");
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {
                System.out.print(" " + arr[i][j]);
                sum = sum + arr[i][j];
            }

            System.out.println();
        }
        System.out.println(sum);

    }

}
