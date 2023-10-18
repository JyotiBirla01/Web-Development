
import java.util.Scanner;

public class TwoPointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                count++;

        }
        for (int i = 0; i < arr.length; i++) {
            if (i < count) {
                arr[i] = 0;
                System.out.print(arr[i] + " ");
            } else {
                arr[i] = 1;
                System.out.print(arr[i] + " ");
            }
        }
    }

}
