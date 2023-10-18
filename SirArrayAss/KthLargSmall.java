
//Q.5 Find the kth largest and kth smallest element in array.
import java.util.Scanner;

public class KthLargSmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int i, j, temp, position = 0;
        int arr[] = new int[n];
        System.out.println("Enter the elements ");
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Enter the value of k");
        int k = sc.nextInt();
        int temp1[] = new int[n];
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
            System.out.println(" sorting  at" + i + "  index " + arr[i]);
        }
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < i + 1; j++) {
                if (arr[i] == arr[j])
                    break;
            }
            if (i == j) {

                temp1[i] = arr[i];
                System.out.println("Distinct element at " + i + " index " + temp1[i]);
            }
        }

        for (i = 0; i < k; i++) {
            position = temp1[n - 1 - i];
        }
        System.out.println("kth largest  is " + i + position);
        System.out.println("kth smallest is " + i + temp1[k - 1]);

    }
}