import java.util.Scanner;

public class RightLeader {
    public void leader(int n, int arr[]) {
        int i, j;
        for (i = 0; i < arr.length; i++) {
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j])
                    break;
            }
            if (j == arr.length)
                System.out.println(arr[i]);

        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in array ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        RightLeader obj = new RightLeader();
        System.out.println("Output is ");
        obj.leader(n, arr);
        // System.out.println(result);
    }
}