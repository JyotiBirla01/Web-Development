
//Q.2 Find minimum and maximum element in array
import java.util.Scanner;

public class Array2 {
    public int max(int n, int arr[]) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public int min(int n, int arr[]) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + i + " element of array ");
            arr[i] = sc.nextInt();

        }
        Array2 obj = new Array2();
        int ans = obj.max(n, arr);
        System.out.println("Maximum number is " + ans);
        Array2 oj2 = new Array2();
        int result = obj.min(n, arr);
        System.out.println(" Minimum number is " + result);

    }
}
