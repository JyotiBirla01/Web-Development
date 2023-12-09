
// wap to find and print prime numbers in given array.
import java.util.Scanner;

public class Ass6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        boolean status = true;
        for (int i = 0; i < n; i++) {
            status = true;

            for (int j = 2; j <= (arr[i] / 2); j++) {
                if (arr[i] % j == 0) {
                    status = false;
                    break;
                }
            }
            if (status && arr[i] > 1)
                System.out.println("The prime number is " + arr[i]);
            else
                System.out.println("The Not  prime number is " + arr[i]);
        }

    }
}
