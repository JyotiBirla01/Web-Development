
//Q.5 Find the kth largest and kth smallest element in array.
import java.util.Scanner;

public class Array5 {
    public int kthLargest(int n, int arr[], int k) {

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
            System.out.println(arr[i]);

        }

        return arr[n - k];

    }

    public int kthSmallest(int n, int arr[], int k) {

        return arr[k - 1];

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in array ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Enter the value of k");
        int k = sc.nextInt();
        Array5 obj = new Array5();
        Array5 obj1 = new Array5();

        int ans = obj.kthLargest(n, arr, k);
        int result = obj1.kthSmallest(ans, arr, k);
        System.out.println("kth largest element is  ");
        System.out.println(ans);
        System.out.println("kth smallest element is ");
        System.out.println(result);

    }

}
