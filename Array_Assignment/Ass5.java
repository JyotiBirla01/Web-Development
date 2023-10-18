
// wap to find and print even numbers in given array
import java.util.Scanner;

public class Ass5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        System.out.println("Enter the number ");
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("The even number are :");
        for (int i = 0; i < 6; i++) {
            if (arr[i] % 2 == 0)
                System.out.println(arr[i]);

        }

    }

}
