import java.util.Scanner;

class Rotate {
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
        k = k % n;
        int ans[] = new int[n];
        int j = 0;
        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.println(ans[i]);
        }

    }

}
