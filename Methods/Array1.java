import java.util.Scanner;

public class Array1 {
    public int peakElement(int n, int arr[]) {
        int i;
        boolean flag = true;
        for (i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {
                flag = false;
            }
        }
        if (arr[0] > arr[1]) {
            flag = false;
        }

        if (arr[n - 1] > arr[n - 2]) {
            flag = false;
        }
        if (flag == false)
            return 1;
        else
            return 0;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Array1 obj = new Array1();
        int x = obj.peakElement(n, arr);
        System.out.println(x);
    }

}
