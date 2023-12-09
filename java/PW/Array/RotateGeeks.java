import java.util.Scanner;

class RotateGeeks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in  array ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Enter the value of k ");
        int k = sc.nextInt();
        System.out.println("After rorating the array ");

        for (int i = 0; i < n; i++) {
            if (i < k)
                System.out.println(arr[n + i - k] + " ");
            else
                System.out.println(arr[i - k] + " ");

        }
        System.out.println();

    }

}
