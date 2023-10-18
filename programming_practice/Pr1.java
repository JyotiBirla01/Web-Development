
import java.util.Scanner;

public class Pr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements ");
        int i;
        boolean flag = false;
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 1; i < n - 1; i++) {
            if (arr[i] <= arr[i + 1] && arr[i] >= arr[i - 1]) {

                flag = true;
            }
        }
        if (arr[0] >= arr[1])
            flag = true;
        // System.out.println(arr[i]);
        if (arr[n - 1] >= arr[n - 2])
            flag = true;
        // System.out.println(arr[i]);
        System.out.println("Peak element is ");
        if (true)
            System.out.println("0");
        else
            System.out.println("1");

    }

}
