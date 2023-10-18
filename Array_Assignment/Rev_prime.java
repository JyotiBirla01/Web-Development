import java.util.Scanner;

public class Rev_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the elements in array ");
        int i = 0, j = 0;
        for (i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();

        }
        for (j = 2; j < arr[i] / 2; j++) {
            if (arr[i] % j == 0) {
                break;
            }
        }
        if (j > arr[i] / 2)
            System.out.println("Prime");
        else
            System.out.println(" Not Prime");

    }

}
