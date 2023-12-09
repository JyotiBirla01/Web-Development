
import java.util.Scanner;

public class TwoPointerZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int left = 0, right = n - 1, temp = 0;

        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = arr[temp];
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;

            }

            if (arr[left] == 0) {

                left++;
            }
            if (arr[right] == 1) {

                right--;
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }

    }

}
